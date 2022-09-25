package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import com.google.android.apps.gsa.nga.engine.p6044n.p6049c.C76288a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80291am;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80292an;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;
import p3186j$.time.Duration;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.o */
/* compiled from: PG */
public final class C76330o implements C76288a {

    /* renamed from: a */
    public static final /* synthetic */ int f211402a = 0;

    /* renamed from: b */
    private static final C58974d f211403b = C58974d.m91136j();

    /* renamed from: c */
    private static final Duration f211404c = Duration.ofSeconds(5);

    /* renamed from: d */
    private static final C58495hd f211405d;

    /* renamed from: e */
    private final C76329n f211406e;

    /* renamed from: f */
    private final C22871g f211407f;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C80291am.PLAY, 126);
        gzVar.mo55429h(C80291am.PAUSE, 127);
        gzVar.mo55429h(C80291am.STOP, 86);
        gzVar.mo55429h(C80291am.PREVIOUS, 88);
        gzVar.mo55429h(C80291am.NEXT, 87);
        f211405d = gzVar.mo55427f(false);
    }

    public C76330o(C76329n nVar, C22871g gVar) {
        this.f211406e = nVar;
        this.f211407f = gVar;
    }

    /* renamed from: c */
    public static void m122949c(int i, C76327l lVar) {
        lVar.f211399a.dispatchMediaButtonEvent(new KeyEvent(0, i));
        lVar.f211399a.dispatchMediaButtonEvent(new KeyEvent(1, i));
    }

    /* renamed from: a */
    public final C60870cx mo72159a(C80295aq aqVar, C65475b bVar) {
        C80292an anVar;
        if (aqVar.f220359a == 15) {
            anVar = (C80292an) aqVar.f220360b;
        } else {
            anVar = C80292an.f220332b;
        }
        C80291am a = C80291am.m128114a(anVar.f220334a);
        if (a == null) {
            a = C80291am.UNRECOGNIZED;
        }
        Integer num = (Integer) f211405d.get(a);
        if (num == null) {
            ((C58970a) ((C58970a) f211403b.mo56225c()).mo56372aa(3513)).mo56389s("MediaControlExecutor invoked with unknown action: %s", a);
            return C118826c.f331423b;
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(this.f211406e.f211401a.getActiveSessions((ComponentName) null)).map(C76328m.f211400a).collect(C58370cn.f155946a);
        if (guVar == null || guVar.isEmpty()) {
            ((C58970a) ((C58970a) f211403b.mo56226d()).mo56372aa(3512)).mo56386p("MediaControlExecutor invoked but there are no active media sessions.");
            return C118826c.f331423b;
        }
        C76327l lVar = (C76327l) guVar.get(0);
        m122949c(num.intValue(), lVar);
        if (a == C80291am.STOP || a == C80291am.PAUSE) {
            C76326k kVar = new C76326k(num.intValue(), lVar);
            lVar.f211399a.registerCallback(kVar, new Handler(Looper.getMainLooper()));
            this.f211407f.mo28213m("[NGA] unregister media control callback", f211404c.toMillis(), new C76325j(lVar, kVar));
        }
        return C118826c.f331423b;
    }

    /* renamed from: b */
    public final int mo72160b() {
        return 60015;
    }
}
