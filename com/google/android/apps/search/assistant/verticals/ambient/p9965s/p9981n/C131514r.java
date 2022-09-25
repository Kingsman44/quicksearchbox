package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import android.net.Uri;
import android.text.TextUtils;
import androidx.slice.C4110i;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import androidx.slice.p194a.C4094a;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83777t;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83778u;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.Arrays;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.r */
/* compiled from: PG */
public final /* synthetic */ class C131514r implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C131444ad f359371a;

    /* renamed from: b */
    public final /* synthetic */ String f359372b;

    public /* synthetic */ C131514r(C131444ad adVar, String str) {
        this.f359371a = adVar;
        this.f359372b = str;
    }

    public final Object call() {
        Slice slice;
        C131444ad adVar = this.f359371a;
        String str = this.f359372b;
        C131454an anVar = adVar.f359266c;
        if (TextUtils.isEmpty(str)) {
            return Optional.empty();
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return Optional.empty();
        }
        if (!anVar.f359284c.mo110301g(parse)) {
            C83777t tVar = (C83777t) C83778u.f228339k.createBuilder();
            tVar.copyOnWrite();
            C83778u uVar = (C83778u) tVar.instance;
            uVar.f228341a |= 32;
            uVar.f228347g = true;
            return Optional.m71637of((C83778u) tVar.build());
        }
        try {
            slice = anVar.f359283b.mo8626a(parse);
        } catch (SecurityException unused) {
            slice = null;
        }
        if (slice != null) {
            C4110i iVar = new C4110i(anVar.f359282a, slice);
            if (!iVar.mo8622k() && !iVar.mo8620i()) {
                if (new C4110i(anVar.f359282a, slice).mo8612a() != 2) {
                    C83777t tVar2 = (C83777t) C83778u.f228339k.createBuilder();
                    tVar2.copyOnWrite();
                    C83778u uVar2 = (C83778u) tVar2.instance;
                    uVar2.f228341a |= 32;
                    uVar2.f228347g = true;
                    return Optional.m71637of((C83778u) tVar2.build());
                }
                String valueOf = String.valueOf(new C4110i(anVar.f359282a, slice).mo8618g());
                C58485gu guVar = (C58485gu) Collection.EL.stream(Arrays.asList(slice.f13088d)).filter(new C131445ae(anVar)).map(C131446af.f359274a).filter(C131447ag.f359275a).map(C131448ah.f359276a).collect(C58370cn.f155946a);
                if (guVar.isEmpty()) {
                    boolean z = false;
                    boolean z2 = false;
                    for (SliceItem sliceItem : Arrays.asList(slice.f13088d)) {
                        if (sliceItem.f13092b.equals("slice") && C131454an.m213898a(sliceItem).isPresent() && Arrays.asList(sliceItem.mo8596d().f13088d).size() == 3) {
                            Optional a = C131454an.m213898a(sliceItem);
                            Objects.requireNonNull(valueOf);
                            if (((Boolean) a.map(new C131453am(valueOf)).orElse(false)).booleanValue()) {
                                z = true;
                            }
                        }
                        if (sliceItem.f13092b.equals("slice")) {
                            C4094a aVar = new C4110i(anVar.f359282a, sliceItem.mo8596d()).f13140f;
                            if (Arrays.asList(sliceItem.mo8596d().f13088d).size() == 2 && aVar != null && !aVar.mo8607d() && C131454an.m213898a(sliceItem).isPresent()) {
                                z2 = true;
                            }
                        }
                    }
                    if (z && z2) {
                        C83777t tVar3 = (C83777t) C83778u.f228339k.createBuilder();
                        tVar3.copyOnWrite();
                        C83778u uVar3 = (C83778u) tVar3.instance;
                        valueOf.getClass();
                        uVar3.f228341a = 1 | uVar3.f228341a;
                        uVar3.f228342b = valueOf;
                        tVar3.copyOnWrite();
                        C83778u uVar4 = (C83778u) tVar3.instance;
                        uVar4.f228341a |= 4;
                        uVar4.f228343c = false;
                        return Optional.m71637of((C83778u) tVar3.build());
                    }
                }
                C83777t tVar4 = (C83777t) C83778u.f228339k.createBuilder();
                tVar4.copyOnWrite();
                C83778u uVar5 = (C83778u) tVar4.instance;
                valueOf.getClass();
                uVar5.f228341a |= 1;
                uVar5.f228342b = valueOf;
                tVar4.copyOnWrite();
                C83778u uVar6 = (C83778u) tVar4.instance;
                uVar6.f228341a |= 4;
                uVar6.f228343c = true;
                tVar4.mo77098a(guVar);
                int size = guVar.size();
                tVar4.copyOnWrite();
                C83778u uVar7 = (C83778u) tVar4.instance;
                uVar7.f228341a |= 8;
                uVar7.f228345e = size;
                return Optional.m71637of((C83778u) tVar4.build());
            }
        }
        return Optional.empty();
    }
}
