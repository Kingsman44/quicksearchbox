package com.google.android.libraries.notifications.data.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.p182p.C3918aa;
import com.google.android.libraries.notifications.data.impl.room.ChimePerAccountRoomDatabase;
import com.google.android.libraries.notifications.platform.p2307a.C30059c;

/* renamed from: com.google.android.libraries.notifications.data.impl.e */
/* compiled from: PG */
public final /* synthetic */ class C29800e implements C30059c {

    /* renamed from: a */
    public final /* synthetic */ Context f80813a;

    public /* synthetic */ C29800e(Context context) {
        this.f80813a = context;
    }

    /* renamed from: a */
    public final Object mo35092a(String str) {
        Context context = this.f80813a;
        if (true == TextUtils.isEmpty(str)) {
            str = "pseudonymous";
        }
        return (ChimePerAccountRoomDatabase) C3918aa.m11218a(context, ChimePerAccountRoomDatabase.class, String.valueOf(str).concat("_room_notifications.db")).mo8155a();
    }
}
