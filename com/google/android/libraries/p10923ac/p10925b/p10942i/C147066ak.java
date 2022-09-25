package com.google.android.libraries.p10923ac.p10925b.p10942i;

import android.content.ContentValues;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.ac.b.i.ak */
/* compiled from: PG */
public final /* synthetic */ class C147066ak implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C147069an f397095a;

    /* renamed from: b */
    public final /* synthetic */ String f397096b;

    /* renamed from: c */
    public final /* synthetic */ ContentValues f397097c;

    public /* synthetic */ C147066ak(C147069an anVar, String str, ContentValues contentValues) {
        this.f397095a = anVar;
        this.f397096b = str;
        this.f397097c = contentValues;
    }

    public final Object call() {
        C147069an anVar = this.f397095a;
        String str = this.f397096b;
        ContentValues contentValues = this.f397097c;
        anVar.mo123898g();
        anVar.f397090e.insertWithOnConflict(str, (String) null, contentValues, 5);
        return null;
    }
}
