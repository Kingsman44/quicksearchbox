package com.google.android.gms.usonia.directory.internal;

import android.app.Activity;
import android.content.Context;
import androidx.core.p097i.C1967b;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143724i;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143785cf;
import com.google.android.gms.common.api.internal.C143796cq;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.usonia.C146154b;
import com.google.android.gms.usonia.PeerAddress;
import com.google.android.gms.usonia.auth.C146121b;
import com.google.android.gms.usonia.auth.internal.SignAppCertificateParams;
import com.google.android.gms.usonia.directory.C146208b;
import com.google.android.gms.usonia.directory.C146209c;
import com.google.android.gms.usonia.metrics.internal.ProtoSafeParcelable;
import java.util.List;

/* renamed from: com.google.android.gms.usonia.directory.internal.bm */
/* compiled from: PG */
public final class C146250bm extends C143847s implements C146268d {

    /* renamed from: a */
    public static final /* synthetic */ int f395108a = 0;

    /* renamed from: b */
    private static final C143841m f395109b = new C143841m("UsoniaService.API", new C146243bf(), new C143840l());

    public C146250bm(Context context) {
        super(context, (Activity) null, f395109b, C143724i.f389627f, C143846r.f389923a);
    }

    /* renamed from: q */
    private static String m238190q(String str, String str2) {
        return str + "-" + str2;
    }

    /* renamed from: a */
    public final Feature[] mo119300a() {
        return new Feature[]{C146154b.f394911a};
    }

    /* renamed from: b */
    public final C146006ab mo122746b(String str, PeerAddress peerAddress) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389862c = new Feature[]{C146154b.f394912b};
        dcVar.f389860a = new C146232av(str, peerAddress);
        dcVar.f389863d = 26452;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: c */
    public final C146006ab mo122747c(String str) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389862c = new Feature[]{C146154b.f394913c};
        dcVar.f389860a = new C146231au(str);
        dcVar.f389863d = 26410;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: d */
    public final C146006ab mo122748d(PeerAddress peerAddress, List list) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389862c = new Feature[]{C146154b.f394915e};
        dcVar.f389860a = new C146229as(list, peerAddress);
        dcVar.f389863d = 26458;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: e */
    public final C146006ab mo122749e(PeerAddress peerAddress, List list) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389862c = new Feature[]{C146154b.f394915e};
        dcVar.f389860a = new C146222al(list, peerAddress);
        dcVar.f389863d = 26457;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: f */
    public final C146006ab mo122750f(String str, C146209c cVar) {
        C143784ce b = C143785cf.m233680b(cVar, this.f389927B, m238190q(C146209c.class.getName(), str));
        C143796cq cqVar = new C143796cq();
        cqVar.f389831a = new C146227aq(b, str);
        cqVar.f389832b = new C146228ar(b, str);
        cqVar.f389833c = b;
        cqVar.f389834d = new Feature[]{C146154b.f394913c};
        cqVar.f389836f = 26403;
        return mo119291v(cqVar.mo119255a());
    }

    /* renamed from: g */
    public final C146006ab mo122751g(String str, C146208b bVar) {
        C143784ce b = C143785cf.m233680b(bVar, this.f389927B, m238190q(C146208b.class.getName(), str));
        C143796cq cqVar = new C143796cq();
        cqVar.f389831a = new C146224an(b, str);
        cqVar.f389832b = new C146226ap(b, str);
        cqVar.f389833c = b;
        cqVar.f389834d = new Feature[]{C146154b.f394913c};
        cqVar.f389836f = 26401;
        return mo119291v(cqVar.mo119255a());
    }

    /* renamed from: h */
    public final C146006ab mo122752h(String str, PeerAddress peerAddress) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389862c = new Feature[]{C146154b.f394913c};
        dcVar.f389860a = new C146220aj(str, peerAddress);
        dcVar.f389863d = 26408;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: i */
    public final C146006ab mo122753i(String str, C146209c cVar) {
        C146010af afVar = new C146010af();
        mo119292w(C143785cf.m233679a(cVar, m238190q(C146209c.class.getName(), str)), 26404).mo122497p(new C146230at(afVar));
        return afVar.f394698a;
    }

    /* renamed from: j */
    public final C146006ab mo122754j(String str, C146208b bVar) {
        C146010af afVar = new C146010af();
        mo119292w(C143785cf.m233679a(bVar, m238190q(C146208b.class.getName(), str)), 26402).mo122497p(new C146221ak(afVar));
        return afVar.f394698a;
    }

    /* renamed from: k */
    public final C146006ab mo122755k(String str, byte[] bArr, int i) {
        C143784ce b = C143785cf.m233680b(C146216af.f395061a, this.f389927B, m238190q("setStateFor", str));
        C143796cq cqVar = new C143796cq();
        cqVar.f389831a = new C146225ao(str, bArr, i, b);
        cqVar.f389832b = C146233aw.f395089a;
        cqVar.f389833c = b;
        cqVar.f389834d = new Feature[]{C146154b.f394913c};
        cqVar.f389836f = 26411;
        return mo119291v(cqVar.mo119255a());
    }

    /* renamed from: l */
    public final void mo122756l(String str, int i, int i2) {
        C143784ce b = C143785cf.m233680b(C146235ay.f395091a, this.f389927B, m238190q("registerServiceFor", str));
        C143796cq cqVar = new C143796cq();
        cqVar.f389831a = new C146236az(str, i, i2, b);
        cqVar.f389832b = C146238ba.f395096a;
        cqVar.f389833c = b;
        cqVar.f389834d = new Feature[]{C146154b.f394913c};
        cqVar.f389836f = 26409;
        mo119291v(cqVar.mo119255a());
    }

    /* renamed from: m */
    public final void mo122757m(C146121b bVar) {
        C143784ce b = C143785cf.m233680b(bVar, this.f389927B, "structureInfo");
        C143796cq cqVar = new C143796cq();
        cqVar.f389831a = new C146217ag(b);
        cqVar.f389832b = new C146218ah(b);
        cqVar.f389833c = b;
        cqVar.f389834d = new Feature[]{C146154b.f394912b};
        cqVar.f389836f = 26455;
        mo119291v(cqVar.mo119255a());
    }

    /* renamed from: n */
    public final void mo122758n(C146121b bVar) {
        mo119292w(C143785cf.m233679a(bVar, "structureInfo"), 26456).mo122497p(new C146219ai(new C146010af()));
    }

    /* renamed from: o */
    public final C146006ab mo122809o(ProtoSafeParcelable protoSafeParcelable, C1967b bVar) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389862c = new Feature[]{C146154b.f394914d};
        dcVar.f389860a = new C146223am(protoSafeParcelable);
        dcVar.f389863d = 26405;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: p */
    public final C146006ab mo122810p(SignAppCertificateParams signAppCertificateParams) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389862c = new Feature[]{C146154b.f394912b};
        dcVar.f389860a = new C146234ax(signAppCertificateParams);
        dcVar.f389863d = 26451;
        return super.mo119290u(0, dcVar.mo119260a());
    }
}
