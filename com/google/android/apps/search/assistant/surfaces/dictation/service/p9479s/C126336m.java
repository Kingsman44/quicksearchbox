package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125045k;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.m */
/* compiled from: PG */
public final class C126336m {

    /* renamed from: a */
    public static final C59071e f348024a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.s.m");

    /* renamed from: a */
    public static C125044j m206590a(C63070h hVar) {
        return (C125044j) m206592c(hVar).map(C126334k.f348022a).orElse(C125044j.UNKNOWN);
    }

    /* renamed from: b */
    public static C51805du m206591b(C63070h hVar) {
        C52230ka a = C126287a.m206487a(hVar);
        if (a == null) {
            return null;
        }
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 2;
        duVar.f135928c = "dictation.GBOARD_SUGGESTION_PRESS";
        dsVar.mo53729a("suggestion_chip_data", a);
        return (C51805du) dsVar.build();
    }

    /* renamed from: c */
    public static Optional m206592c(C63070h hVar) {
        return Optional.ofNullable(C126287a.m206487a(hVar)).flatMap(C126335l.f348023a);
    }

    /* renamed from: d */
    public static Optional m206593d(C52230ka kaVar) {
        if (!kaVar.f137060b.equals("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.internal.SuggestionChipData")) {
            return Optional.empty();
        }
        C63010eb parserForType = C125045k.f345012c.getParserForType();
        Object obj = null;
        if (!kaVar.f137060b.equals("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.internal.SuggestionChipData")) {
            ((C59052c) ((C59052c) C126287a.f347953a.mo56226d()).mo56372aa(37000)).mo56354G("Bad protobuf type: got %s, expected %s [SD]", C126290c.m206496a(kaVar.f137060b), C126290c.m206496a("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.internal.SuggestionChipData"));
        } else {
            try {
                obj = parserForType.mo59008g(kaVar.f137061c);
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) C126287a.f347953a.mo56226d()).mo56382g(e)).mo56372aa(36999)).mo56386p("Malformed protobuf payload. [SD]");
            }
        }
        return Optional.ofNullable((C125045k) obj);
    }
}
