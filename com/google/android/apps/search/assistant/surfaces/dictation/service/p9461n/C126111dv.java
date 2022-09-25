package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.api.a.al;
import com.google.android.apps.gsa.nga.api.a.o;
import com.google.android.apps.gsa.unifiedime.C118606x;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125064as;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.regex.Pattern;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.dv */
/* compiled from: PG */
final class C126111dv {

    /* renamed from: a */
    public static final Pattern f347536a = Pattern.compile("\\p{So}\\p{M}*+\\p{Sk}*+");

    /* renamed from: a */
    static C125065at m206214a(C125065at atVar) {
        int size = atVar.f345042a.size();
        C125064as asVar = (C125064as) atVar.toBuilder();
        if (size > 0) {
            asVar.mo106796d(size - 1);
            if (size > 1) {
                int i = size - 2;
                if (((C118606x) atVar.f345042a.get(i)).f330895b.equals(" ")) {
                    asVar.mo106796d(i);
                }
            }
        }
        return (C125065at) asVar.build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126032h m206215b(com.google.android.apps.gsa.nga.api.a.f r3) {
        /*
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.g r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126032h.m206067g()
            java.lang.String r1 = r3.a
            r0.mo107218f(r1)
            com.google.protobuf.h r3 = r3.d
            if (r3 != 0) goto L_0x000f
            com.google.protobuf.h r3 = com.google.protobuf.C63070h.f170215c
        L_0x000f:
            j$.util.Optional r3 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126336m.m206592c(r3)
            boolean r1 = r3.isPresent()
            if (r1 == 0) goto L_0x0099
            java.lang.Object r1 = r3.get()
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.k r1 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125045k) r1
            int r1 = r1.f345014a
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.j r1 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j.m204969a(r1)
            if (r1 != 0) goto L_0x0029
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.j r1 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j.UNRECOGNIZED
        L_0x0029:
            r0.mo107215c(r1)
            java.lang.Object r1 = r3.get()
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.k r1 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125045k) r1
            int r1 = r1.f345014a
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.j r1 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j.m204969a(r1)
            if (r1 != 0) goto L_0x003c
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.j r1 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j.UNRECOGNIZED
        L_0x003c:
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x004e
            r2 = 17
            if (r1 == r2) goto L_0x004c
            r2 = 18
            if (r1 == r2) goto L_0x004e
            r1 = 3
            goto L_0x004f
        L_0x004c:
            r1 = 4
            goto L_0x004f
        L_0x004e:
            r1 = 1
        L_0x004f:
            r2 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.a r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C125970a) r2
            r2.f347197c = r1
            java.lang.Object r1 = r3.get()
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.k r1 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125045k) r1
            int r1 = r1.f345014a
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.j r1 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j.m204969a(r1)
            if (r1 != 0) goto L_0x0064
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.j r1 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j.UNRECOGNIZED
        L_0x0064:
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.j r2 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j.EMOJI_SUGGESTION
            if (r1 != r2) goto L_0x0099
            java.lang.Object r1 = r3.get()
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.k r1 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125045k) r1
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.f r1 = r1.f345015b
            if (r1 != 0) goto L_0x0074
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.f r1 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125040f.f344977e
        L_0x0074:
            r0.mo107217e(r1)
            java.lang.Object r1 = r3.get()
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.k r1 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125045k) r1
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.f r1 = r1.f345015b
            if (r1 != 0) goto L_0x0083
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.f r1 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125040f.f344977e
        L_0x0083:
            java.lang.String r1 = r1.f344979a
            r0.mo107218f(r1)
            java.lang.Object r3 = r3.get()
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.k r3 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125045k) r3
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.f r3 = r3.f345015b
            if (r3 != 0) goto L_0x0094
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.f r3 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125040f.f344977e
        L_0x0094:
            java.lang.String r3 = r3.f344980b
            r0.mo107216d(r3)
        L_0x0099:
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.h r3 = r0.mo107213a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126111dv.m206215b(com.google.android.apps.gsa.nga.api.a.f):com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.h");
    }

    /* renamed from: c */
    static C58485gu m206216c(al alVar) {
        o oVar = alVar.b;
        if (oVar == null) {
            oVar = o.g;
        }
        if (oVar.b.isEmpty()) {
            return C58485gu.m89845m();
        }
        o oVar2 = alVar.b;
        if (oVar2 == null) {
            oVar2 = o.g;
        }
        return (C58485gu) Collection.EL.stream(oVar2.b).map(C126110du.f347535a).collect(C58370cn.f155946a);
    }

    /* renamed from: d */
    static String m206217d(C125065at atVar, C125065at atVar2) {
        if (atVar.f345042a.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        return ((String) IntStream.CC.range(atVar2.f345042a.size(), atVar.f345042a.size()).mapToObj(new C126108ds(atVar)).collect(Collectors.joining())).trim();
    }

    /* renamed from: e */
    static String m206218e(C125065at atVar) {
        return (String) Collection.EL.stream(atVar.f345042a).map(C126109dt.f347534a).collect(Collectors.joining());
    }
}
