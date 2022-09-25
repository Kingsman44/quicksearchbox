package com.google.android.libraries.geller.portable;

import com.google.net.p4726a.p4727a.C62722b;

/* compiled from: PG */
public class GellerException extends Exception {

    /* renamed from: a */
    public final C62722b f60397a;

    public GellerException(int i, String str) {
        this(C62722b.m94931a(i), str);
    }

    public GellerException(C62722b bVar, String str) {
        super(String.format("Code: %s, Message: %s", new Object[]{bVar.name(), str}));
        this.f60397a = bVar;
    }

    public GellerException(C62722b bVar, String str, Throwable th) {
        super(String.format("Code: %s, Message: %s", new Object[]{bVar.name(), str}), th);
        this.f60397a = bVar;
    }
}
