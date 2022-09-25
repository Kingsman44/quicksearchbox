package com.google.android.apps.gsa.staticplugins.opa.ambient.p8229c.p8230a;

import com.google.android.apps.gsa.opa.p6429a.p6430a.C83563a;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.c.a.a */
/* compiled from: PG */
public final class C106601a {

    /* renamed from: a */
    final C58485gu f297232a;

    /* renamed from: b */
    public final boolean f297233b;

    public C106601a(Optional optional) {
        if (optional.isPresent()) {
            C58485gu guVar = (C58485gu) optional.get();
            this.f297232a = guVar;
            this.f297233b = !guVar.isEmpty();
            return;
        }
        this.f297232a = C58485gu.m89845m();
        this.f297233b = false;
    }

    /* renamed from: a */
    public final void mo95587a(int i, String str, Object... objArr) {
        if (this.f297233b) {
            String.format(str, objArr);
            mo95589c(i);
        }
    }

    /* renamed from: b */
    public final void mo95588b(int i, String str, Object... objArr) {
        if (this.f297233b) {
            String.format(str, objArr);
            mo95590d(i);
        }
    }

    /* renamed from: c */
    public final void mo95589c(int i) {
        if (this.f297233b) {
            C58485gu guVar = this.f297232a;
            int size = guVar.size();
            int i2 = 0;
            while (i2 < size) {
                C83563a aVar = (C83563a) guVar.get(i2);
                i2++;
                if (i == aVar.mo76897a()) {
                    aVar.mo76898b();
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo95590d(int i) {
        if (this.f297233b) {
            C58485gu guVar = this.f297232a;
            int size = guVar.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                C83563a aVar = (C83563a) guVar.get(i2);
                i2++;
                if (i == aVar.mo76897a()) {
                    aVar.mo76899c();
                    break;
                }
            }
            mo95589c(i);
            mo95589c(1);
        }
    }
}
