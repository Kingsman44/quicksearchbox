package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.ViewGroup;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14392hn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14393ho;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14478ks;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14479kt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14588ou;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p001a.p007b.p011b.p012a.C0025a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.bv */
/* compiled from: PG */
public final class C15212bv {

    /* renamed from: a */
    public static final C59071e f45662a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.d.bv");

    /* renamed from: b */
    public final C14986h f45663b;

    /* renamed from: c */
    public final C14132bf f45664c;

    /* renamed from: d */
    public ViewGroup f45665d;

    /* renamed from: e */
    public C14588ou f45666e;

    public C15212bv(C14986h hVar, C14132bf bfVar) {
        this.f45663b = hVar;
        this.f45664c = bfVar;
    }

    /* renamed from: a */
    public final void mo22087a() {
        C14588ou ouVar = this.f45666e;
        ouVar.getClass();
        int c = C0025a.m8c(ouVar.f44103a);
        int i = 1;
        if (c == 0) {
            c = 1;
        }
        int i2 = c - 2;
        if (i2 == 0 || i2 == 5) {
            C14986h hVar = this.f45663b;
            C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
            C14392hn hnVar = (C14392hn) C14393ho.f43534d.createBuilder();
            hnVar.copyOnWrite();
            ((C14393ho) hnVar.instance).f43537b = 5;
            gtVar.copyOnWrite();
            C14492lf lfVar = (C14492lf) gtVar.instance;
            C14393ho hoVar = (C14393ho) hnVar.build();
            hoVar.getClass();
            lfVar.f43801d = hoVar;
            lfVar.f43800c = 7;
            hVar.mo21875g((C14492lf) gtVar.build());
        } else if (i2 != 8) {
            C59104x c2 = f45662a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "Morris.NotPermTskRndr");
            C59052c cVar = (C59052c) ((C59052c) c2).mo56372aa(46017);
            C14588ou ouVar2 = this.f45666e;
            ouVar2.getClass();
            int c3 = C0025a.m8c(ouVar2.f44103a);
            if (c3 != 0) {
                i = c3;
            }
            cVar.mo56389s("Attempted Notification Permission task event from unsupported FullscreenMode %s", C0025a.m6a(i));
        } else {
            C14986h hVar2 = this.f45663b;
            C14371gt gtVar2 = (C14371gt) C14492lf.f43796e.createBuilder();
            C14478ks ksVar = (C14478ks) C14479kt.f43760e.createBuilder();
            ksVar.copyOnWrite();
            ((C14479kt) ksVar.instance).f43763b = 9;
            gtVar2.copyOnWrite();
            C14492lf lfVar2 = (C14492lf) gtVar2.instance;
            C14479kt ktVar = (C14479kt) ksVar.build();
            ktVar.getClass();
            lfVar2.f43801d = ktVar;
            lfVar2.f43800c = 17;
            hVar2.mo21875g((C14492lf) gtVar2.build());
        }
    }
}
