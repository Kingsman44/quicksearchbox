package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82378cz;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.speech.p5218j.C67150mx;
import com.google.speech.p5218j.C67152mz;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.be */
/* compiled from: PG */
public final /* synthetic */ class C77778be implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C77782bi f214253a;

    /* renamed from: b */
    public final /* synthetic */ String f214254b;

    /* renamed from: c */
    public final /* synthetic */ C67150mx f214255c;

    /* renamed from: d */
    public final /* synthetic */ int f214256d;

    /* renamed from: e */
    public final /* synthetic */ String f214257e;

    public /* synthetic */ C77778be(C77782bi biVar, String str, C67150mx mxVar, int i, String str2) {
        this.f214253a = biVar;
        this.f214254b = str;
        this.f214255c = mxVar;
        this.f214256d = i;
        this.f214257e = str2;
    }

    public final void run() {
        C77782bi biVar = this.f214253a;
        String str = this.f214254b;
        C67150mx mxVar = this.f214255c;
        int i = this.f214256d;
        String str2 = this.f214257e;
        long a = C77782bi.m124786a(new File(str));
        C83305i iVar = biVar.f214264d;
        C67152mz a2 = C67152mz.m97427a(mxVar.f182527b);
        if (a2 == null) {
            a2 = C67152mz.NO_ERROR;
        }
        String name = a2.name();
        if (name != null) {
            iVar.mo75579d(new C82378cz("NGA_LANGUAGE_PACK_SIZE2", Double.valueOf((double) a), i, str2, name));
            return;
        }
        throw new NullPointerException("Null failureReason");
    }
}
