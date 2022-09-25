package com.google.android.libraries.p10923ac.p10925b.p10942i;

import android.database.Cursor;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147178l;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.ac.b.i.al */
/* compiled from: PG */
public final /* synthetic */ class C147067al implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C147069an f397098a;

    /* renamed from: b */
    public final /* synthetic */ String f397099b;

    /* renamed from: c */
    public final /* synthetic */ C147063ah f397100c;

    public /* synthetic */ C147067al(C147069an anVar, String str, C147063ah ahVar) {
        this.f397098a = anVar;
        this.f397099b = str;
        this.f397100c = ahVar;
    }

    public final Object call() {
        C147069an anVar = this.f397098a;
        String str = this.f397099b;
        C147063ah ahVar = this.f397100c;
        anVar.mo123898g();
        Cursor rawQuery = anVar.f397090e.rawQuery(str, (String[]) null);
        C147178l.m240009b(rawQuery);
        try {
            Object a = ahVar.mo123868a(rawQuery);
            rawQuery.close();
            return a;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
