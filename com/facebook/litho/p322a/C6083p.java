package com.facebook.litho.p322a;

import com.facebook.litho.C6373gz;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.facebook.litho.a.p */
/* compiled from: PG */
public final class C6083p extends C6080m {

    /* renamed from: a */
    private final List f17968a;

    /* renamed from: b */
    private final C6079l f17969b;

    /* renamed from: c */
    private final HashSet f17970c = new HashSet();

    /* renamed from: d */
    private int f17971d = 0;

    /* renamed from: e */
    private boolean f17972e = false;

    /* renamed from: f */
    private boolean f17973f = false;

    /* renamed from: g */
    private C6373gz f17974g;

    public C6083p(List list) {
        this.f17968a = list;
        if (!list.isEmpty()) {
            this.f17969b = new C6082o(this);
            return;
        }
        throw new IllegalArgumentException("Empty binding parallel");
    }

    /* renamed from: c */
    public final void mo12770c(ArrayList arrayList) {
        int size = this.f17968a.size();
        for (int i = 0; i < size; i++) {
            ((C6078k) this.f17968a.get(i)).mo12770c(arrayList);
        }
    }

    /* renamed from: e */
    public final void mo12772e() {
        if (this.f17973f) {
            this.f17973f = false;
            this.f17974g = null;
            int size = this.f17968a.size();
            for (int i = 0; i < size; i++) {
                C6078k kVar = (C6078k) this.f17968a.get(i);
                if (kVar.mo12773f()) {
                    kVar.mo12772e();
                }
            }
        }
    }

    /* renamed from: f */
    public final boolean mo12773f() {
        return this.f17973f;
    }

    /* renamed from: g */
    public final void mo12774g(C6373gz gzVar) {
        if (!this.f17972e) {
            this.f17972e = true;
            this.f17974g = gzVar;
            if (!mo12783l()) {
                mo12780i();
                return;
            }
            mo12782k();
            this.f17973f = true;
            for (C6078k b : this.f17968a) {
                b.mo12769b(this.f17969b);
            }
            int size = this.f17968a.size();
            for (int i = 0; i < size; i++) {
                ((C6078k) this.f17968a.get(i)).mo12774g(this.f17974g);
            }
            this.f17968a.size();
            return;
        }
        throw new RuntimeException("Starting binding multiple times");
    }

    /* renamed from: m */
    public final void mo12784m(C6078k kVar) {
        if (!this.f17970c.contains(kVar)) {
            this.f17970c.add(kVar);
            this.f17971d++;
            kVar.mo12771d(this.f17969b);
            if (this.f17971d >= this.f17968a.size()) {
                this.f17973f = false;
                mo12781j();
                return;
            }
            return;
        }
        throw new RuntimeException("Binding unexpectedly completed twice");
    }
}
