package com.google.android.apps.gsa.nga.engine.screen.parser.impl;

import com.google.android.apps.gsa.nga.d.a.aa;
import com.google.android.apps.gsa.nga.d.a.y;
import com.google.android.apps.gsa.nga.engine.p6142u.C78007b;
import com.google.android.apps.gsa.nga.engine.screen.p6139a.C77911a;
import com.google.android.apps.gsa.nga.engine.screen.parser.C77947a;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80903ar;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* compiled from: PG */
public final class ScreenContentParserImpl implements C77947a {

    /* renamed from: a */
    public final C77911a f214689a;

    /* renamed from: b */
    public final C22871g f214690b;

    /* renamed from: c */
    public final C78007b f214691c;

    /* compiled from: PG */
    class NativeScreenContentParser {
        /* renamed from: a */
        static final aa m125114a(C78007b bVar, y yVar, long j) {
            bVar.mo72960b();
            byte[] nativeProcessParsingRequest = nativeProcessParsingRequest(j, yVar.toByteArray());
            if (nativeProcessParsingRequest != null) {
                return C62942bv.parseFrom((C62942bv) aa.c, nativeProcessParsingRequest, C62921ba.m95368a());
            }
            throw new C62974ct("Unable to parse native response: null returned.");
        }

        private static native byte[] nativeProcessParsingRequest(long j, byte[] bArr);
    }

    public ScreenContentParserImpl(C77911a aVar, C22871g gVar, C78007b bVar) {
        this.f214689a = aVar;
        this.f214690b = gVar;
        this.f214691c = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo72912a(y yVar, long j, C80903ar arVar) {
        this.f214689a.f214626a.mo74271b(C89849ae.NGA_SCREEN_PARSING_START);
        C22871g gVar = this.f214690b;
        C60870cx j2 = gVar.mo28210j(gVar.mo28201a("[NGA] ScreenContentParser.parse.parseUsingInitialRequest", new C77949b(this, yVar, j)), "[NGA] ScreenContentParser.parse", new C77950c(this, arVar, j));
        C60856cj.m92911t(j2, new C77952e(this), C60826bg.f164896a);
        return j2;
    }
}
