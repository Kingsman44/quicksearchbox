package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.assistant.p3886c.C50690ab;
import com.google.common.p4522b.C58485gu;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.by */
/* compiled from: PG */
public final /* synthetic */ class C106917by implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C106917by f297825a = new C106917by();

    private /* synthetic */ C106917by() {
    }

    public final int compare(Object obj, Object obj2) {
        C50690ab abVar = (C50690ab) obj;
        C50690ab abVar2 = (C50690ab) obj2;
        C58485gu guVar = C106918bz.f297826a;
        if (abVar.equals(abVar2)) {
            return 0;
        }
        int indexOf = C106918bz.f297826a.indexOf(abVar);
        if (indexOf != -1) {
            int indexOf2 = C106918bz.f297826a.indexOf(abVar2);
            if (indexOf2 != -1) {
                if (indexOf == indexOf2) {
                    return 0;
                }
                if (indexOf < indexOf2) {
                    return -1;
                }
            }
            return -1;
        }
        return 1;
    }
}
