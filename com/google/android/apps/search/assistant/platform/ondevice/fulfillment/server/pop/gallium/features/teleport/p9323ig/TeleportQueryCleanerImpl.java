package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.List;
import java.util.Locale;
import p001a.p014d.p015a.p016a.C0039ab;
import p001a.p014d.p015a.p016a.C0060e;
import p001a.p014d.p015a.p016a.C0061f;
import p001a.p014d.p015a.p016a.C0063h;
import p001a.p014d.p015a.p016a.C0065j;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.TeleportQueryCleanerImpl */
/* compiled from: PG */
public final class TeleportQueryCleanerImpl implements C123392ds {

    /* renamed from: a */
    public static final C59071e f341027a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.TeleportQueryCleanerImpl");

    /* renamed from: b */
    public final C123331bl f341028b;

    /* renamed from: c */
    private final C123501ht f341029c;

    /* renamed from: d */
    private final Locale f341030d;

    public TeleportQueryCleanerImpl(C123501ht htVar, C123331bl blVar, Locale locale) {
        this.f341029c = htVar;
        this.f341028b = blVar;
        this.f341030d = locale;
    }

    private static native byte[] nativeQueryCleanup(byte[] bArr);

    public static native void nativeUpdateResources(byte[] bArr);

    /* renamed from: a */
    public final String mo105911a(String str, C123427f fVar) {
        Optional optional;
        C123501ht htVar = this.f341029c;
        C58528ij F = C58528ij.m90006F(((C0039ab) Collection.EL.stream(htVar.mo106022b(str, this.f341028b).f113b).map(new C123492hk(htVar)).reduce(C0039ab.f104e, C123493hl.f341291a)).f109d);
        C58485gu guVar = (C58485gu) Collection.EL.stream((C58485gu) Collection.EL.stream(fVar.mo105927h()).filter(C123292a.f341031a).collect(C58370cn.f155946a)).map(new C123397dx(this, fVar)).collect(C58370cn.f155946a);
        Optional findFirst = Collection.EL.stream(guVar).filter(new C123398dy(str, this.f341028b.mo105989a(str))).findFirst();
        C0060e eVar = (C0060e) C0061f.f159h.createBuilder();
        String i = fVar.mo105929i();
        eVar.copyOnWrite();
        C0061f fVar2 = (C0061f) eVar.instance;
        i.getClass();
        fVar2.f161a |= 1;
        fVar2.f162b = i;
        eVar.copyOnWrite();
        C0061f fVar3 = (C0061f) eVar.instance;
        str.getClass();
        fVar3.f161a |= 2;
        fVar3.f163c = str;
        String languageTag = this.f341030d.toLanguageTag();
        eVar.copyOnWrite();
        C0061f fVar4 = (C0061f) eVar.instance;
        languageTag.getClass();
        fVar4.f161a |= 4;
        fVar4.f164d = languageTag;
        eVar.mo25a(guVar);
        C0065j jVar = (C0065j) findFirst.orElse(C0065j.f172g);
        eVar.copyOnWrite();
        C0061f fVar5 = (C0061f) eVar.instance;
        jVar.getClass();
        fVar5.f166f = jVar;
        fVar5.f161a |= 8;
        eVar.mo26b((C58528ij) Collection.EL.stream((C58485gu) Collection.EL.stream(fVar.mo105927h()).filter(C123319b.f341071a).collect(C58370cn.f155946a)).filter(new C123395dv(F)).map(new C123396dw(fVar)).collect(C58370cn.f155947b));
        try {
            optional = Optional.m71637of((C0063h) C62942bv.parseFrom((C62942bv) C0063h.f168c, nativeQueryCleanup(((C0061f) eVar.build()).toByteArray()), C62921ba.m95368a()));
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f341027a.mo56225c()).mo56382g(e)).mo56372aa(35014)).mo56386p("Failed to parse protobuf from native code");
            optional = Optional.empty();
        }
        return (String) optional.map(C123393dt.f341154a).orElse(BuildConfig.FLAVOR);
    }

    /* renamed from: b */
    public final /* synthetic */ String mo105912b(String str, String str2, List list) {
        return mo105911a(str, C123427f.m202785d(str2, list));
    }
}
