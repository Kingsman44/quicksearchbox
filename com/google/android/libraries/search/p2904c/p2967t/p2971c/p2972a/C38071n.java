package com.google.android.libraries.search.p2904c.p2967t.p2971c.p2972a;

import android.content.Context;
import android.media.AudioRecordingConfiguration;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38094r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.p5463a.C69531o;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.t.c.a.n */
/* compiled from: PG */
public final class C38071n implements C38094r {

    /* renamed from: a */
    private static final List f100879a = C69540x.m100944b("com.google.android.as");

    /* renamed from: b */
    private static final C59071e f100880b = C59071e.m91331h();

    /* renamed from: c */
    private final Context f100881c;

    public C38071n(Context context) {
        C69664n.m101061g(context, "context");
        this.f100881c = context;
    }

    /* renamed from: a */
    public final boolean mo41239a(AudioRecordingConfiguration audioRecordingConfiguration) {
        Object obj;
        List n;
        Set Z;
        C69664n.m101061g(audioRecordingConfiguration, "configuration");
        try {
            obj = Integer.valueOf(audioRecordingConfiguration.getClientUid());
        } catch (Throwable th) {
            obj = C69714l.m101133a(th);
        }
        Throwable a = C69702k.m101124a(obj);
        if (a == null) {
            String[] packagesForUid = this.f100881c.getPackageManager().getPackagesForUid(((Number) obj).intValue());
            if (packagesForUid == null || (n = C69531o.m100937n(packagesForUid)) == null || (Z = C69540x.m100844Z(n, f100879a)) == null) {
                return false;
            }
            return !Z.isEmpty();
        }
        C59052c cVar = (C59052c) f100880b.mo56226d();
        cVar.mo56378ag(C58975e.f156826a, "ALT.PlatformMicUse");
        C59052c cVar2 = (C59052c) cVar.mo56382g(a);
        cVar2.mo56374ac(250, TimeUnit.MILLISECONDS);
        cVar2.mo56379ah(new C59094n(52964));
        cVar2.mo56386p("#audio# cannot detect the package for platform mic use");
        return false;
    }
}
