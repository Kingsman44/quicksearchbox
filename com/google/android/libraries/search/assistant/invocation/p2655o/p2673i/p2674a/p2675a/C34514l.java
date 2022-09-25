package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a;

import android.os.ParcelFileDescriptor;
import com.google.android.libraries.search.assistant.p2511d.C32561x;
import com.google.android.libraries.search.p2904c.C37362b;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37776k;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.android.libraries.search.p2904c.p2908b.p2910b.C37376c;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59337t;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executor;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.l */
/* compiled from: PG */
final class C34514l implements C37362b {

    /* renamed from: a */
    final /* synthetic */ C34517o f91729a;

    /* renamed from: b */
    public final C37376c f91730b;

    /* renamed from: c */
    private final ParcelFileDescriptor f91731c;

    /* renamed from: d */
    private final FileChannel f91732d;

    public C34514l(C34517o oVar, C37376c cVar, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) {
        C69664n.m101061g(cVar, "session");
        C69664n.m101061g(parcelFileDescriptor, "reader");
        C69664n.m101061g(parcelFileDescriptor2, "writer");
        this.f91729a = oVar;
        this.f91730b = cVar;
        this.f91731c = parcelFileDescriptor;
        FileChannel channel = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2).getChannel();
        C69664n.m101060f(channel, "AutoCloseOutputStream(writer).channel");
        this.f91732d = channel;
    }

    /* renamed from: c */
    private final void m63240c() {
        C59052c cVar = (C59052c) C34517o.f91740a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.HotwordLegacyUri");
        cVar.mo56379ah(new C59094n(51388));
        cVar.mo56386p("Stopping soda route to uri conversion session.");
        C59337t.m92223c(this.f91731c);
        C59337t.m92223c(this.f91732d);
        C46459k.m82829b(C32561x.m60381a(this.f91729a.f91743d, new C34513k(this, (C69577g) null)), "Failed to close reading session!", new Object[0]);
    }

    /* renamed from: b */
    public final void mo39010b(C37819l lVar) {
        C37680i iVar;
        C69664n.m101061g(lVar, "data");
        if (this.f91732d.isOpen()) {
            try {
                int a = C37776k.m66678a(lVar.f100343b);
                int[] iArr = C34512j.f91726a;
                int i = a - 1;
                if (a == 0) {
                    throw null;
                } else if (iArr[i] == 1) {
                    FileChannel fileChannel = this.f91732d;
                    if (lVar.f100343b == 1) {
                        iVar = (C37680i) lVar.f100344c;
                    } else {
                        iVar = C37680i.f100071c;
                    }
                    C69664n.m101060f(iVar, "data.audio");
                    ByteBuffer wrap = ByteBuffer.wrap(iVar.f100074b.mo59174N());
                    C69664n.m101060f(wrap, "wrap(bytes.toByteArray())");
                    fileChannel.write(wrap);
                } else {
                    m63240c();
                }
            } catch (IOException e) {
                C59052c cVar = (C59052c) C34517o.f91740a.mo56226d();
                cVar.mo56378ag(C58975e.f156826a, "TRG.HotwordLegacyUri");
                C59052c cVar2 = (C59052c) cVar.mo56382g(e);
                cVar2.mo56380ai(C58979ad.NONE);
                cVar2.mo56379ah(new C59094n(51389));
                cVar2.mo56386p("Failed to write audio to pfd (closed uri?).");
                m63240c();
            }
        }
    }

    /* renamed from: k */
    public final Executor mo39011k() {
        return this.f91729a.f91742c;
    }
}
