package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import com.google.common.base.C58827ar;
import com.google.protobuf.MessageLite;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.h */
/* compiled from: PG */
public final class C90972h {
    /* renamed from: a */
    static void m148590a(String str, List list, C90974j jVar) {
        if (!list.isEmpty()) {
            jVar.mo85258b(str);
            jVar.mo85261e();
            jVar.mo85257a(C58827ar.m90818c(',').mo56097d(list));
            jVar.mo85260d();
        }
    }

    /* renamed from: b */
    public static void m148591b(MessageLite messageLite, C90983s sVar) {
        if (messageLite != null) {
            sVar.mo85255a(messageLite);
        }
    }

    /* renamed from: c */
    public static void m148592c(String str, List list, C90983s sVar) {
        if (list != null && !list.isEmpty()) {
            sVar.f254188a.mo85258b(str);
            sVar.f254188a.mo85261e();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sVar.mo85255a((MessageLite) it.next());
            }
            sVar.f254188a.mo85260d();
        }
    }

    /* renamed from: d */
    static void m148593d(String str, List list, C90974j jVar) {
        if (list != null && !list.isEmpty()) {
            jVar.mo85258b(str);
            jVar.mo85261e();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jVar.mo85257a((String) it.next());
            }
            jVar.mo85260d();
        }
    }
}
