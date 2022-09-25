package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.ar */
/* compiled from: PG */
public final /* synthetic */ class C112738ar implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C112738ar f312511a = new C112738ar();

    private /* synthetic */ C112738ar() {
    }

    public final int compare(Object obj, Object obj2) {
        C113321r rVar = (C113321r) obj;
        C113321r rVar2 = (C113321r) obj2;
        if (!rVar.f313839f.equals("vnd.android.cursor.item/phone_v2") || !rVar2.f313839f.equals("vnd.android.cursor.item/phone_v2")) {
            if (rVar.f313839f.equals("vnd.android.cursor.item/phone_v2") || rVar2.f313839f.equals("vnd.android.cursor.item/phone_v2")) {
                return !rVar.f313839f.equals("vnd.android.cursor.item/phone_v2") ? -1 : 1;
            }
            return rVar.f313842i.compareTo(rVar2.f313842i);
        } else if (rVar.f313846m) {
            return -1;
        } else {
            if (rVar2.f313846m) {
                return 1;
            }
            return rVar.f313842i.compareTo(rVar2.f313842i);
        }
    }
}
