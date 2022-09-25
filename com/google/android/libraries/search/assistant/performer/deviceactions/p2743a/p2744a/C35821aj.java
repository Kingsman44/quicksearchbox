package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import androidx.slice.C4110i;
import androidx.slice.Slice;
import androidx.slice.p194a.C4094a;
import com.google.assistant.p3897e.p3921j.C52098fd;
import com.google.assistant.p3897e.p3921j.C52099fe;
import com.google.assistant.p3897e.p3921j.C52103fi;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.aj */
/* compiled from: PG */
public final /* synthetic */ class C35821aj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C35823al f93854a;

    /* renamed from: b */
    public final /* synthetic */ String f93855b;

    /* renamed from: c */
    public final /* synthetic */ String f93856c;

    /* renamed from: d */
    public final /* synthetic */ C35835ax f93857d;

    /* renamed from: e */
    public final /* synthetic */ C52099fe f93858e;

    /* renamed from: f */
    public final /* synthetic */ C52098fd f93859f;

    public /* synthetic */ C35821aj(C35823al alVar, String str, String str2, C35835ax axVar, C52099fe feVar, C52098fd fdVar) {
        this.f93854a = alVar;
        this.f93855b = str;
        this.f93856c = str2;
        this.f93857d = axVar;
        this.f93858e = feVar;
        this.f93859f = fdVar;
    }

    public final Object apply(Object obj) {
        Optional optional;
        int i;
        Optional optional2;
        C35823al alVar = this.f93854a;
        String str = this.f93855b;
        String str2 = this.f93856c;
        C35835ax axVar = this.f93857d;
        C52099fe feVar = this.f93858e;
        C52098fd fdVar = this.f93859f;
        if (!((Boolean) obj).booleanValue()) {
            ((C59052c) ((C59052c) C35823al.f93863a.mo56226d()).mo56372aa(51941)).mo56389s("Slice api failed to load slice for setting: sliceUri %s.", str);
            alVar.f93868e.mo39897e(str2, C62722b.UNAVAILABLE);
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        Slice slice = axVar.f93909f;
        if (slice == null) {
            optional = Optional.empty();
        } else if (!new C4110i(axVar.f93905b, slice).mo8619h().isEmpty()) {
            Slice slice2 = axVar.f93909f;
            if (slice2 == null) {
                optional2 = Optional.empty();
            } else {
                List h = new C4110i(axVar.f93905b, slice2).mo8619h();
                if (h.isEmpty()) {
                    optional2 = Optional.empty();
                } else {
                    optional2 = Optional.m71637of(Boolean.valueOf(((C4094a) h.get(0)).f13111f));
                }
            }
            if (optional2.isEmpty()) {
                optional = Optional.empty();
            } else {
                optional = Optional.m71637of(true != ((Boolean) optional2.get()).booleanValue() ? "0" : "1");
            }
        } else {
            Slice slice3 = axVar.f93909f;
            if (slice3 == null) {
                i = -1;
            } else {
                i = new C4110i(axVar.f93905b, slice3).mo8613b();
            }
            if (i == -1) {
                optional = Optional.empty();
            } else {
                optional = Optional.m71637of(String.valueOf(i));
            }
        }
        if (optional.isPresent()) {
            feVar.copyOnWrite();
            C52103fi fiVar = (C52103fi) feVar.instance;
            C52103fi fiVar2 = C52103fi.f136729i;
            fiVar.f136734d = 3;
            fiVar.f136731a |= 4;
            String str3 = (String) optional.get();
            feVar.copyOnWrite();
            C52103fi fiVar3 = (C52103fi) feVar.instance;
            str3.getClass();
            fiVar3.f136731a |= 1;
            fiVar3.f136732b = str3;
            feVar.copyOnWrite();
            C52103fi fiVar4 = (C52103fi) feVar.instance;
            fiVar4.f136731a |= 2;
            fiVar4.f136733c = true;
            fdVar.mo53798b(str2, (C52103fi) feVar.build());
            alVar.f93868e.mo39897e(str2, C62722b.OK);
            return true;
        }
        ((C59052c) ((C59052c) C35823al.f93863a.mo56226d()).mo56372aa(51939)).mo56389s("Slice api failed to retrieve setting value: sliceUri %s.", str);
        feVar.copyOnWrite();
        C52103fi fiVar5 = (C52103fi) feVar.instance;
        C52103fi fiVar6 = C52103fi.f136729i;
        fiVar5.f136734d = 1;
        fiVar5.f136731a |= 4;
        feVar.copyOnWrite();
        C52103fi fiVar7 = (C52103fi) feVar.instance;
        fiVar7.f136731a |= 2;
        fiVar7.f136733c = false;
        fdVar.mo53798b(str2, (C52103fi) feVar.build());
        alVar.f93868e.mo39897e(str2, C62722b.UNAVAILABLE);
        return false;
    }
}
