package com.google.android.libraries.search.p2904c.p2931i.p2932a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2168g;
import com.google.android.libraries.search.p2904c.C37459ch;
import com.google.android.libraries.search.p2904c.C37460ci;
import com.google.android.libraries.search.p2904c.C37476cy;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.c.i.a.d */
/* compiled from: PG */
public final /* synthetic */ class C37685d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C37689h f100079a;

    /* renamed from: b */
    public final /* synthetic */ C37476cy f100080b;

    public /* synthetic */ C37685d(C37689h hVar, C37476cy cyVar) {
        this.f100079a = hVar;
        this.f100080b = cyVar;
    }

    public final void run() {
        C37689h hVar = this.f100079a;
        C37476cy cyVar = this.f100080b;
        if (!((C2168g) hVar.f100087c).f6144b.isDone()) {
            ((C59052c) ((C59052c) C37689h.f100084a.mo56226d()).mo56372aa(52767)).mo56386p("#audio# Timeout while trying to disconnect from Bluetooth Route.");
            C2164c cVar = hVar.f100088d;
            C37459ch chVar = (C37459ch) C37460ci.f99438c.createBuilder();
            chVar.copyOnWrite();
            C37460ci ciVar = (C37460ci) chVar.instance;
            ciVar.f99441b = cyVar.f99492t;
            ciVar.f99440a |= 1;
            cVar.mo5437b((C37460ci) chVar.build());
        }
    }
}
