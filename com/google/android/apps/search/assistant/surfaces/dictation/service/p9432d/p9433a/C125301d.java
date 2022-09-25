package com.google.android.apps.search.assistant.surfaces.dictation.service.p9432d.p9433a;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17046am;
import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import java.util.Locale;
import java.util.NoSuchElementException;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.d.a.d */
/* compiled from: PG */
public final /* synthetic */ class C125301d implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ String f345657a;

    /* renamed from: b */
    public final /* synthetic */ String f345658b;

    /* renamed from: c */
    public final /* synthetic */ Locale f345659c;

    /* renamed from: d */
    public final /* synthetic */ C17046am f345660d;

    public /* synthetic */ C125301d(String str, String str2, Locale locale, C17046am amVar) {
        this.f345657a = str;
        this.f345658b = str2;
        this.f345659c = locale;
        this.f345660d = amVar;
    }

    public final Object get() {
        String str = this.f345657a;
        String str2 = this.f345658b;
        Locale locale = this.f345659c;
        C17046am amVar = this.f345660d;
        Object[] objArr = new Object[4];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = locale;
        C29690f fVar = amVar.f49658b;
        if (fVar == null) {
            fVar = C29690f.f80408m;
        }
        C29689e a = C29689e.m54781a(fVar.f80415f);
        if (a == null) {
            a = C29689e.UNSPECIFIED;
        }
        objArr[3] = a.name();
        return new NoSuchElementException(String.format("Couldn't find %s in file group %s for %s. Status : %s", objArr));
    }
}
