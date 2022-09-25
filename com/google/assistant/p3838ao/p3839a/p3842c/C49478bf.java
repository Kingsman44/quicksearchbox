package com.google.assistant.p3838ao.p3839a.p3842c;

import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.C49693s;
import com.google.assistant.p3838ao.p3839a.p3845e.C49563bt;
import com.google.assistant.p3838ao.p3839a.p3845e.C49564bu;
import com.google.assistant.p3838ao.p3839a.p3846f.C49641e;
import com.google.assistant.p3838ao.p3839a.p3846f.C49642f;
import com.google.assistant.p3838ao.p3839a.p3849i.C49681l;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.assistant.ao.a.c.bf */
/* compiled from: PG */
public final class C49478bf implements C49477be {
    /* renamed from: a */
    public final C58485gu mo53269a() {
        throw null;
    }

    /* renamed from: b */
    public final /* synthetic */ C58485gu mo53270b(C49692r rVar) {
        Optional a = C49641e.m85608a(rVar);
        if (!a.isPresent()) {
            a = rVar.mo53331r();
        }
        if (a.isEmpty()) {
            return C58485gu.m89845m();
        }
        C49693s c = C49681l.m85670c(rVar.mo53333t(R.string.nga_suggestion_chip_escape_hatch, new Object[0]), ((C49642f) a.get()).mo53284e(), 1.0d);
        C49563bt btVar = (C49563bt) C49564bu.f127892d.createBuilder();
        btVar.copyOnWrite();
        C49564bu buVar = (C49564bu) btVar.instance;
        buVar.f127894a |= 1;
        buVar.f127895b = true;
        btVar.copyOnWrite();
        C49564bu buVar2 = (C49564bu) btVar.instance;
        buVar2.f127894a |= 2;
        buVar2.f127896c = true;
        c.f128270n = (C49564bu) btVar.build();
        return C58485gu.m89846n(c);
    }
}
