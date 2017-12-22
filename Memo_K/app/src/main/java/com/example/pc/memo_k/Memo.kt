package com.example.pc.memo_k

import io.realm.RealmModel
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

/**
 * Created by pc on 2017-12-21.
 */
@RealmClass
open class Memo(
        @PrimaryKey
        var id: Int = 0,
        var title: String = "",
        var text: String = "",
        var date: String = "") : RealmModel