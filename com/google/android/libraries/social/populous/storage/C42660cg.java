package com.google.android.libraries.social.populous.storage;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.social.populous.storage.cg */
/* compiled from: PG */
public final /* synthetic */ class C42660cg implements Callable {

    /* renamed from: a */
    public final /* synthetic */ RoomDatabaseManager f111864a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f111865b;

    public /* synthetic */ C42660cg(RoomDatabaseManager roomDatabaseManager, Runnable runnable) {
        this.f111864a = roomDatabaseManager;
        this.f111865b = runnable;
    }

    public final Object call() {
        this.f111864a.mo45693I(this.f111865b);
        return null;
    }
}
