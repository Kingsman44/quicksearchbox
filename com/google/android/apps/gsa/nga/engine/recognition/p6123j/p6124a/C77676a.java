package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.recognition.C77889u;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82317as;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82546je;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82547jf;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.p4527a.C58970a;
import java.io.InputStream;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.a */
/* compiled from: PG */
public final /* synthetic */ class C77676a implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C77710h f213956a;

    /* renamed from: b */
    public final /* synthetic */ InputStream f213957b;

    /* renamed from: c */
    public final /* synthetic */ Duration f213958c;

    public /* synthetic */ C77676a(C77710h hVar, InputStream inputStream, Duration duration) {
        this.f213956a = hVar;
        this.f213957b = inputStream;
        this.f213958c = duration;
    }

    public final void run() {
        C77710h hVar = this.f213956a;
        InputStream inputStream = this.f213957b;
        Duration duration = this.f213958c;
        C83305i iVar = hVar.f214062n;
        C82546je h = C82547jf.m131449h();
        String name = C77889u.S3.name();
        if (name != null) {
            C82317as asVar = (C82317as) h;
            asVar.f224865b = name;
            asVar.f224866c = BuildConfig.FLAVOR;
            h.mo75677c(hVar.f214057i.mo72021b().mo72042g());
            h.mo75676b();
            iVar.mo75579d(h.mo75675a());
            inputStream.close();
            ((C58970a) ((C58970a) C77710h.f214049a.mo56226d()).mo56372aa(4375)).mo56388r("NGA S3 stayed %d milliseconds with the mic opened", duration.toMillis());
            return;
        }
        throw new NullPointerException("Null speechRecognizer");
    }
}
