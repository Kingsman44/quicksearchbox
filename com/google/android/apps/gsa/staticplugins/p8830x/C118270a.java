package com.google.android.apps.gsa.staticplugins.p8830x;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4541l.C59326i;
import java.security.MessageDigest;

/* renamed from: com.google.android.apps.gsa.staticplugins.x.a */
/* compiled from: PG */
public final /* synthetic */ class C118270a implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C118273b f328332a;

    public /* synthetic */ C118270a(C118273b bVar) {
        this.f328332a = bVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C118273b bVar = this.f328332a;
        try {
            PackageInfo packageInfo = bVar.f328335b.getPackageInfo(bVar.f328336c, 64);
            if (packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                ((C59052c) ((C59052c) C118273b.f328334a.mo56225c()).mo56372aa(18950)).mo56386p("No signatures in package info");
                return C58836b.f156633a;
            }
            MessageDigest messageDigest = (MessageDigest) bVar.f328337f.mo17428b();
            if (messageDigest == null) {
                ((C59052c) ((C59052c) C118273b.f328334a.mo56225c()).mo56372aa(18953)).mo56386p("No MessageDigest for SHA1");
                return C58836b.f156633a;
            }
            byte[] digest = messageDigest.digest(packageInfo.signatures[0].toByteArray());
            if (digest != null) {
                return C58833ax.m90834k(C59326i.f157519g.mo56827g().mo56837l(digest, digest.length));
            }
            ((C59052c) ((C59052c) C118273b.f328334a.mo56225c()).mo56372aa(18952)).mo56386p("Could not digest signature");
            return C58836b.f156633a;
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) C118273b.f328334a.mo56225c()).mo56382g(e)).mo56372aa(18951)).mo56386p("Could not find certificate for package");
        }
    }
}
