package com.google.apps.tiktok.inject.p3659d;

import com.google.common.base.C58838bb;
import java.util.Stack;

/* renamed from: com.google.apps.tiktok.inject.d.i */
/* compiled from: PG */
public final class C47240i {

    /* renamed from: a */
    private static final ThreadLocal f122901a = new C47238g();

    /* renamed from: a */
    public static void m84034a(Object obj) {
        ((C47239h) ((Stack) f122901a.get()).pop()).mo30890a(obj);
    }

    /* renamed from: b */
    public static void m84035b(C47239h hVar) {
        C58838bb.m90883r(((C47239h) ((Stack) f122901a.get()).pop()) == hVar);
    }

    /* renamed from: c */
    public static void m84036c(C47239h hVar) {
        hVar.getClass();
        ((Stack) f122901a.get()).push(hVar);
    }
}
