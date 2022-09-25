package com.google.android.libraries.storage.protostore;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.common.util.concurrent.C60934v;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: com.google.android.libraries.storage.protostore.x */
/* compiled from: PG */
public final /* synthetic */ class C43021x implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42875aa f112507a;

    /* renamed from: b */
    public final /* synthetic */ int f112508b;

    /* renamed from: c */
    public final /* synthetic */ List f112509c;

    public /* synthetic */ C43021x(C42875aa aaVar, int i, List list) {
        this.f112507a = aaVar;
        this.f112508b = i;
        this.f112509c = list;
    }

    public final C60870cx apply(Object obj) {
        C42875aa aaVar = this.f112507a;
        int i = this.f112508b;
        List list = this.f112509c;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) C60856cj.m92909r((Future) list.get(i2))).booleanValue()) {
                arrayList.add(((C43019v) aaVar.f112183a.get(i2)).mo18054a());
            }
        }
        return C60856cj.m92894c(arrayList).mo57334a(new C60934v((Object) null), C60826bg.f164896a);
    }
}
