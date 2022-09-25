package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.assistant.e.j.ew */
/* compiled from: PG */
public final class C52090ew extends C62934bn implements C52092ey {
    public C52090ew() {
        super(C52091ex.f136710b);
    }

    /* renamed from: a */
    public final List mo53788a() {
        return Collections.unmodifiableList(((C52091ex) this.instance).f136712a);
    }

    /* renamed from: b */
    public final C52232kc mo53789b(int i) {
        return (C52232kc) ((C52091ex) this.instance).f136712a.get(i);
    }

    /* renamed from: c */
    public final void mo53790c(Iterable iterable) {
        copyOnWrite();
        C52091ex exVar = (C52091ex) this.instance;
        C52091ex exVar2 = C52091ex.f136710b;
        exVar.mo53796b();
        C62947c.addAll(iterable, (List) exVar.f136712a);
    }

    /* renamed from: d */
    public final void mo53791d(C52231kb kbVar) {
        copyOnWrite();
        C52091ex exVar = (C52091ex) this.instance;
        C52232kc kcVar = (C52232kc) kbVar.build();
        C52091ex exVar2 = C52091ex.f136710b;
        kcVar.getClass();
        exVar.mo53796b();
        exVar.f136712a.add(kcVar);
    }

    /* renamed from: e */
    public final void mo53792e(C52232kc kcVar) {
        copyOnWrite();
        C52091ex exVar = (C52091ex) this.instance;
        C52091ex exVar2 = C52091ex.f136710b;
        kcVar.getClass();
        exVar.mo53796b();
        exVar.f136712a.add(kcVar);
    }

    /* renamed from: f */
    public final void mo53793f(int i) {
        copyOnWrite();
        C52091ex exVar = (C52091ex) this.instance;
        C52091ex exVar2 = C52091ex.f136710b;
        exVar.mo53796b();
        exVar.f136712a.remove(i);
    }

    /* renamed from: g */
    public final void mo53794g(int i, C52231kb kbVar) {
        copyOnWrite();
        C52091ex exVar = (C52091ex) this.instance;
        C52232kc kcVar = (C52232kc) kbVar.build();
        C52091ex exVar2 = C52091ex.f136710b;
        kcVar.getClass();
        exVar.mo53796b();
        exVar.f136712a.set(i, kcVar);
    }

    /* renamed from: h */
    public final void mo53795h(int i, C52232kc kcVar) {
        copyOnWrite();
        C52091ex exVar = (C52091ex) this.instance;
        C52091ex exVar2 = C52091ex.f136710b;
        kcVar.getClass();
        exVar.mo53796b();
        exVar.f136712a.set(i, kcVar);
    }
}
