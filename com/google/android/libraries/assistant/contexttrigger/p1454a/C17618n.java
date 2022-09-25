package com.google.android.libraries.assistant.contexttrigger.p1454a;

import android.content.Intent;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.libraries.assistant.contexttrigger.C17693f;
import com.google.android.libraries.assistant.contexttrigger.C17742i;
import com.google.android.libraries.assistant.contexttrigger.p1462f.C17703ai;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3803ag.p3807b.p3808a.C48922x;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.a.n */
/* compiled from: PG */
public final class C17618n implements C17614j {

    /* renamed from: b */
    private static final C59071e f50735b = C59071e.m91332i("com.google.android.libraries.assistant.contexttrigger.a.n");

    /* renamed from: a */
    public final C17742i f50736a;

    /* renamed from: c */
    private final Executor f50737c;

    /* renamed from: d */
    private final C17703ai f50738d;

    public C17618n(Executor executor, C17703ai aiVar, C17742i iVar) {
        this.f50737c = executor;
        this.f50738d = aiVar;
        this.f50736a = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo23414a(Intent intent) {
        C48922x xVar;
        Optional optional;
        int i = ((FenceStateImpl) FenceStateImpl.m234223a(intent)).f390277a;
        if (i == 1) {
            xVar = C48922x.NOT_ACTIVE;
        } else if (i != 2) {
            xVar = C48922x.UNKNOWN;
        } else {
            xVar = C48922x.ACTIVE;
        }
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("context_trigger_request");
            if (byteArrayExtra != null) {
                optional = Optional.m71637of((C17693f) C62942bv.parseFrom((C62942bv) C17693f.f50865e, byteArrayExtra, C62921ba.m95368a()));
                if (!optional.isPresent()) {
                    return C60866ct.f164955a;
                }
                String str = ((C17693f) optional.get()).f50868b;
                C58480gp e = C58485gu.m89837e();
                return C47633f.m84733g(C47633f.m84733g(this.f50738d.mo23444a(new C17616l(str, xVar, e))).mo51516i(new C17617m(this, e), this.f50737c)).mo51515h(C17615k.f50729a, this.f50737c);
            }
            throw new IllegalArgumentException(String.format("Awareness Intent doesn't contain '%s'.", new Object[]{"context_trigger_request"}));
        } catch (Exception e2) {
            ((C59052c) ((C59052c) ((C59052c) f50735b.mo56225c()).mo56382g(e2)).mo56372aa(46936)).mo56386p("Can't parse ContextTriggerInternalRequest from Awareness Intent.");
            optional = Optional.empty();
        }
    }
}
