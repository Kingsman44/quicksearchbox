package com.google.android.libraries.surveys.internal.view;

import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;
import com.google.p4281bu.p4282a.C56493ad;
import com.google.p4281bu.p4282a.C56517ba;
import com.google.p4281bu.p4282a.C56546cc;

/* renamed from: com.google.android.libraries.surveys.internal.view.a */
/* compiled from: PG */
public abstract class C43071a extends Fragment {

    /* renamed from: a */
    protected C56546cc f112647a;

    /* renamed from: b */
    protected C56493ad f112648b;

    /* renamed from: c */
    protected Integer f112649c;

    /* renamed from: a */
    static Bundle m76028a(C56546cc ccVar, Integer num, int i) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("Question", ccVar.toByteArray());
        if (num != null) {
            bundle.putInt("DisplayLogoResId", num.intValue());
        }
        bundle.putInt("QuestionIndex", i);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r0 = (com.google.android.libraries.surveys.internal.view.C43130ce) r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.surveys.internal.view.C43130ce mo46119b() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            boolean r1 = r0 instanceof com.google.android.libraries.surveys.internal.view.C43130ce
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.google.android.libraries.surveys.internal.view.ce r0 = (com.google.android.libraries.surveys.internal.view.C43130ce) r0
            android.app.Activity r1 = r0.mo46109v()
            if (r1 == 0) goto L_0x0020
            boolean r3 = r1.isFinishing()
            if (r3 != 0) goto L_0x0020
            boolean r1 = r1.isDestroyed()
            if (r1 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            return r0
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.surveys.internal.view.C43071a.mo46119b():com.google.android.libraries.surveys.internal.view.ce");
    }

    /* renamed from: c */
    public abstract C56517ba mo46120c();

    /* renamed from: d */
    public void mo46121d() {
    }

    /* renamed from: e */
    public abstract void mo46122e();

    /* renamed from: f */
    public abstract void mo46123f(String str);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        byte[] byteArray = arguments.getByteArray("Question");
        if (byteArray != null) {
            this.f112647a = (C56546cc) C43066o.m75983d(C56546cc.f150991j, byteArray);
        }
        this.f112649c = arguments.containsKey("DisplayLogoResId") ? Integer.valueOf(arguments.getInt("DisplayLogoResId", 0)) : null;
        arguments.getInt("QuestionIndex");
        byte[] byteArray2 = arguments.getByteArray("Completion");
        if (byteArray2 != null) {
            this.f112648b = (C56493ad) C43066o.m75983d(C56493ad.f150888f, byteArray2);
        }
    }
}
