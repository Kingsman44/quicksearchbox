package com.facebook.litho.p322a;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.facebook.litho.a.m */
/* compiled from: PG */
abstract class C6080m implements C6078k {

    /* renamed from: a */
    private final CopyOnWriteArrayList f17965a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final Object mo12768a() {
        return null;
    }

    /* renamed from: b */
    public final void mo12769b(C6079l lVar) {
        this.f17965a.add(lVar);
    }

    /* renamed from: d */
    public final void mo12771d(C6079l lVar) {
        this.f17965a.remove(lVar);
    }

    /* renamed from: h */
    public final void mo12775h() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo12780i() {
        int size = this.f17965a.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C6079l) this.f17965a.get(size)).mo12776a(this);
            } else {
                return;
            }
        }
    }

    /* renamed from: j */
    public final void mo12781j() {
        int size = this.f17965a.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C6079l) this.f17965a.get(size)).mo12777b(this);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo12782k() {
        int size = this.f17965a.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C6079l) this.f17965a.get(size)).mo12778c(this);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo12783l() {
        int size = this.f17965a.size();
        do {
            size--;
            if (size < 0) {
                return true;
            }
        } while (((C6079l) this.f17965a.get(size)).mo12779d(this));
        return false;
    }
}
