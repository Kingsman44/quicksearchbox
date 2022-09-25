package com.google.android.libraries.storage.protostore;

import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.storage.protostore.bz */
/* compiled from: PG */
public final /* synthetic */ class C42930bz implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C42939cg f112308a;

    public /* synthetic */ C42930bz(C42939cg cgVar) {
        this.f112308a = cgVar;
    }

    public final Object call() {
        C42939cg cgVar = this.f112308a;
        cgVar.f112333e = cgVar.f112329a.getSharedPreferences(cgVar.f112330b, 0);
        Set<String> set = cgVar.f112331c;
        if (set == null) {
            return Boolean.valueOf(!cgVar.f112333e.getAll().isEmpty());
        }
        for (String contains : set) {
            if (cgVar.f112333e.contains(contains)) {
                return true;
            }
        }
        return false;
    }
}
