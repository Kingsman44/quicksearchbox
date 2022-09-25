package com.google.android.libraries.lens.view.flags;

import android.os.Bundle;
import com.google.common.p4522b.C58485gu;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.flags.j */
/* compiled from: PG */
public final /* synthetic */ class C26252j implements C26256n {

    /* renamed from: a */
    public static final /* synthetic */ C26252j f71388a = new C26252j();

    private /* synthetic */ C26252j() {
    }

    /* renamed from: a */
    public final Map.Entry mo31466a(Bundle bundle, String str) {
        Integer valueOf = Integer.valueOf(Integer.parseInt(str));
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        stringArrayList.getClass();
        return new AbstractMap.SimpleEntry(valueOf, C58485gu.m89842j(stringArrayList));
    }
}
