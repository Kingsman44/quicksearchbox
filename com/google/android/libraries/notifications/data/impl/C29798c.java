package com.google.android.libraries.notifications.data.impl;

import com.google.android.libraries.notifications.data.impl.room.ChimePerAccountRoomDatabase;
import com.google.android.libraries.notifications.platform.p2307a.C30059c;
import com.google.android.libraries.notifications.platform.p2307a.C30060d;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.libraries.notifications.data.impl.c */
/* compiled from: PG */
public final /* synthetic */ class C29798c implements C30059c {

    /* renamed from: a */
    public final /* synthetic */ C30060d f80811a;

    /* renamed from: b */
    public final /* synthetic */ C21370a f80812b;

    public /* synthetic */ C29798c(C30060d dVar, C21370a aVar) {
        this.f80811a = dVar;
        this.f80812b = aVar;
    }

    /* renamed from: a */
    public final Object mo35092a(String str) {
        C30060d dVar = this.f80811a;
        return new C29805j((ChimePerAccountRoomDatabase) dVar.mo35400a(str), this.f80812b);
    }
}
