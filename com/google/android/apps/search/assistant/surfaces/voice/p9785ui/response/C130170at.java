package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127405b;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C51814ab;
import com.google.assistant.p3897e.p3921j.p3926e.C51815ac;
import com.google.protobuf.C62974ct;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.at */
/* compiled from: PG */
public final class C130170at {
    /* renamed from: a */
    public static final boolean m212511a(C51809dy dyVar) {
        Optional optional;
        int a;
        if (!C69664n.m101066l(dyVar.f135936b, "ui.KEEP_SCREEN_CONTENTS")) {
            return false;
        }
        try {
            optional = C127405b.m208358b(dyVar, "keep_screen_contents_args", C51815ac.f135941f.getParserForType());
        } catch (C62974ct unused) {
            optional = Optional.empty();
        }
        if (!optional.isPresent() || (a = C51814ab.m86397a(((C51815ac) optional.get()).f135944b)) == 0 || a != 2) {
            return false;
        }
        return true;
    }
}
