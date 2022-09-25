package com.google.android.libraries.search.p2992d;

import com.google.frameworks.client.data.android.p4632a.C61333a;
import com.google.frameworks.client.data.android.p4632a.C61343d;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.d.d */
/* compiled from: PG */
public final /* synthetic */ class C38293d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C38296g f101447a;

    /* renamed from: b */
    public final /* synthetic */ String f101448b;

    /* renamed from: c */
    public final /* synthetic */ boolean f101449c;

    /* renamed from: d */
    public final /* synthetic */ Set f101450d;

    public /* synthetic */ C38293d(C38296g gVar, String str, boolean z, Set set) {
        this.f101447a = gVar;
        this.f101448b = str;
        this.f101449c = z;
        this.f101450d = set;
    }

    public final Object call() {
        C38296g gVar = this.f101447a;
        String str = this.f101448b;
        boolean z = this.f101449c;
        Set set = this.f101450d;
        C61333a a = C61333a.m93820a(str);
        C61343d dVar = gVar.f101460c;
        if (z) {
            return dVar.mo57911a(a, set);
        }
        return dVar.mo57912b(a, set);
    }
}
