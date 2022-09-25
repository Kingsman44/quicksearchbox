package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import android.text.TextUtils;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.bv */
/* compiled from: PG */
public final class C113164bv {

    /* renamed from: a */
    private static final C59071e f313481a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.q.bv");

    /* renamed from: a */
    public static C58485gu m187180a(List list) {
        C58480gp e = C58485gu.m89837e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                if (!TextUtils.isEmpty(str)) {
                    e.mo55395g(C48634bw.m85247a(str));
                }
            } catch (IllegalArgumentException e2) {
                ((C59052c) ((C59052c) ((C59052c) f313481a.mo56225c()).mo56382g(e2)).mo56372aa(27971)).mo56389s("no SignalCase enum for \"%s\"", str);
            }
        }
        return e.mo55394f();
    }

    /* renamed from: b */
    public static C58485gu m187181b(List list) {
        C58480gp e = C58485gu.m89837e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                if (!TextUtils.isEmpty(str)) {
                    e.mo55395g(C48672ag.m85258a(str));
                }
            } catch (IllegalArgumentException e2) {
                ((C59052c) ((C59052c) ((C59052c) f313481a.mo56225c()).mo56382g(e2)).mo56372aa(27972)).mo56389s("no SourceType enum for \"%s\"", str);
            }
        }
        return e.mo55394f();
    }
}
