package com.google.p4583d.p4584a.p4586b;

import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.p4585a.C60953a;
import com.google.p4583d.p4584a.p4588d.C60980g;
import com.google.p4583d.p4584a.p4588d.C60987n;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.d.a.b.j */
/* compiled from: PG */
public final class C60964j extends C60980g {

    /* renamed from: a */
    private final Callable f165081a;

    public C60964j(Callable callable) {
        super("internal.appMetadata");
        this.f165081a = callable;
    }

    /* renamed from: a */
    public final C60987n mo57451a(C61012g gVar, List list) {
        try {
            return C60953a.m93113b(this.f165081a.call());
        } catch (Exception unused) {
            return C60987n.f165114f;
        }
    }
}
