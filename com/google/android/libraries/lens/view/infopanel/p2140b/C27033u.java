package com.google.android.libraries.lens.view.infopanel.p2140b;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.View;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.lens.view.infopanel.p2142c.C27081h;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.protos.youtube.elements.p5165a.C66038z;
import p5488io.p5490b.p5496d.C69819a;

/* renamed from: com.google.android.libraries.lens.view.infopanel.b.u */
/* compiled from: PG */
public final /* synthetic */ class C27033u implements C69819a {

    /* renamed from: a */
    public final /* synthetic */ C27034v f73681a;

    /* renamed from: b */
    public final /* synthetic */ C21311r f73682b;

    /* renamed from: c */
    public final /* synthetic */ C66038z f73683c;

    public /* synthetic */ C27033u(C27034v vVar, C21311r rVar, C66038z zVar) {
        this.f73681a = vVar;
        this.f73682b = rVar;
        this.f73683c = zVar;
    }

    /* renamed from: a */
    public final void mo25795a() {
        C27034v vVar = this.f73681a;
        C21311r rVar = this.f73682b;
        C66038z zVar = this.f73683c;
        View b = rVar.mo26732b();
        b.getClass();
        if (!zVar.f179601b.isEmpty()) {
            Intent parseUri = Intent.parseUri(zVar.f179601b, 0);
            String str = parseUri.getPackage();
            if (str != null) {
                try {
                    vVar.f73684a.getPackageManager().getPackageInfo(str, 1);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            parseUri.addCategory("android.intent.category.BROWSABLE");
            C47393f.m84237h(new C27081h(parseUri, b), b);
            return;
        }
        if (!zVar.f179602c.isEmpty()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(zVar.f179602c));
            C47393f.m84237h(new C27081h(intent, b), b);
            return;
        }
        throw new RuntimeException("Received an empty UrlCommand from an Elements card.");
    }
}
