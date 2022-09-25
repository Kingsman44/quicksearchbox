package com.google.android.libraries.assistant.auto.ondevice.utils;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.languagepack.aj;
import com.google.android.apps.gsa.search.core.carassistant.p6782e.C85710c;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p4242bp.p4243a.p4245b.C56152k;
import com.google.p4242bp.p4243a.p4245b.C56153l;
import com.google.p4242bp.p4243a.p4245b.C56154m;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4850an.C63595f;
import com.google.speech.grammar.pumpkin.C66525q;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public class SemanticsBuilderUtil {

    /* renamed from: b */
    private static final C58974d f38326b = C58974d.m91134h("SemanticsBuilderUtil");

    /* renamed from: c */
    private static String f38327c = BuildConfig.FLAVOR;

    /* renamed from: a */
    public final C85710c f38328a;

    /* renamed from: d */
    private final Context f38329d;

    /* renamed from: e */
    private final aj f38330e;

    public SemanticsBuilderUtil(Context context, C85710c cVar, aj ajVar) {
        this.f38329d = context;
        this.f38328a = cVar;
        f38327c = BuildConfig.FLAVOR;
        this.f38330e = ajVar;
    }

    static native byte[] nativeBuildAnalyzerResponse(byte[] bArr, byte[] bArr2);

    static native boolean nativeInitSemanticsBuilder(byte[] bArr);

    /* renamed from: a */
    public final C58833ax mo20311a(C66525q qVar, C56152k kVar) {
        C58872ci d = C58872ci.m90947d(C58274c.f155808a);
        String a = this.f38328a.mo79343a();
        if (!f38327c.equals(a)) {
            C58833ax a2 = this.f38330e.a(this.f38329d, a, "assistant_response_semantics.pumpkin", C56154m.f149619a.getParserForType());
            C58833ax a3 = this.f38330e.a(this.f38329d, a, "semantics.pumpkin", C56154m.f149619a.getParserForType());
            C56153l lVar = (C56153l) C56154m.f149619a.createBuilder();
            if (a3.mo56113h()) {
                lVar.mergeFrom((C56154m) a3.mo56107c());
            }
            if (a2.mo56113h()) {
                lVar.mergeFrom((C56154m) a2.mo56107c());
            }
            C56154m mVar = (C56154m) lVar.build();
            if (mVar == null || !nativeInitSemanticsBuilder(mVar.toByteArray())) {
                ((C58970a) ((C58970a) f38326b.mo56226d()).mo56372aa(43898)).mo56386p("SemanticsBuilder can not be initialized");
            } else {
                d.mo56158a(TimeUnit.MILLISECONDS);
                f38327c = a;
            }
        }
        C63595f fVar = C63595f.f172013d;
        try {
            byte[] nativeBuildAnalyzerResponse = nativeBuildAnalyzerResponse(qVar.toByteArray(), kVar.toByteArray());
            if (nativeBuildAnalyzerResponse != null) {
                return C58833ax.m90834k((C63595f) C62942bv.parseFrom((C62942bv) C63595f.f172013d, nativeBuildAnalyzerResponse, C62921ba.m95368a()));
            }
        } catch (UnsatisfiedLinkError e) {
            ((C58970a) ((C58970a) ((C58970a) f38326b.mo56225c()).mo56382g(e)).mo56372aa(43896)).mo56389s("Error from nativeBuildAnalyzerResponse: %s", e);
        } catch (C62974ct e2) {
            ((C58970a) ((C58970a) ((C58970a) f38326b.mo56225c()).mo56382g(e2)).mo56372aa(43897)).mo56386p("Couldn't parse analyzerResponseBytes bytes.");
        }
        return C58836b.f156633a;
    }
}
