package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.UUID;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.q */
/* compiled from: PG */
public final class C94893q extends Exception {

    /* renamed from: a */
    public final int f265431a;

    public C94893q(String str) {
        super(str);
        this.f265431a = 0;
    }

    public C94893q(String str, Throwable th) {
        super(str, th);
        this.f265431a = 0;
    }

    public C94893q(String str, UUID uuid) {
        super(str);
        C58976aa aaVar = C58975e.f156826a;
        if (uuid.equals(C94872au.f265314a)) {
            this.f265431a = 18;
        } else if (uuid.equals(C94872au.f265316c)) {
            this.f265431a = 19;
        } else if (uuid.equals(C94872au.f265317d)) {
            this.f265431a = 20;
        } else if (uuid.equals(C94872au.f265318e)) {
            this.f265431a = 16;
        } else if (uuid.equals(C94872au.f265319f)) {
            this.f265431a = 15;
        } else if (uuid.equals(C94872au.f265320g)) {
            this.f265431a = 22;
        } else if (uuid.equals(C94872au.f265321h)) {
            this.f265431a = 21;
        } else {
            this.f265431a = 0;
        }
    }
}
