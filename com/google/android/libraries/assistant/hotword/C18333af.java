package com.google.android.libraries.assistant.hotword;

import android.os.ParcelFileDescriptor;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.hotword.af */
/* compiled from: PG */
final class C18333af implements Callable {

    /* renamed from: a */
    final /* synthetic */ int f51988a;

    /* renamed from: b */
    final /* synthetic */ boolean f51989b;

    /* renamed from: c */
    final /* synthetic */ C18339al f51990c;

    public C18333af(C18339al alVar, int i, boolean z) {
        this.f51990c = alVar;
        this.f51988a = i;
        this.f51989b = z;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        C18339al alVar = this.f51990c;
        int i = this.f51988a;
        boolean z2 = this.f51989b;
        synchronized (alVar.f52013m) {
            z = false;
            if (i <= 0) {
                ((C58970a) ((C58970a) C18339al.f51996a.mo56225c()).mo56372aa(47281)).mo56386p("#startMicHotwordInternal - Invalid channel count.");
            } else if (!alVar.mo23805v()) {
                ((C58970a) ((C58970a) C18339al.f51996a.mo56224b()).mo56372aa(47280)).mo56386p("Detector is not ready.");
            } else {
                alVar.f52015o = C18339al.m35666j(alVar.f52002b) > 0;
                alVar.mo23802s(i, z2);
                synchronized (alVar.f52006f) {
                    alVar.f52007g = alVar.f52149p.mo23807a(alVar.f52008h);
                    if (alVar.f52007g == null) {
                        ((C58970a) ((C58970a) C18339al.f51996a.mo56225c()).mo56372aa(47279)).mo56386p("Unable to create parcel file descriptor.");
                    } else {
                        C18328aa aaVar = alVar.f52010j;
                        aaVar.f51972a = false;
                        aaVar.f51973b = 0;
                        boolean z3 = alVar.f52016r;
                        aaVar.f51974c = z3;
                        if (z3) {
                            C18340am amVar = alVar.f52017s;
                            if (amVar.f52025b == null) {
                                try {
                                    ((C58970a) ((C58970a) C18340am.f52024a.mo56224b()).mo56372aa(47288)).mo56386p("creating pipe");
                                    amVar.f52025b = ParcelFileDescriptor.createPipe();
                                    if (amVar.f52025b[1] != null) {
                                        amVar.f52026c = new ParcelFileDescriptor.AutoCloseOutputStream(amVar.f52025b[1]);
                                        ((C58970a) ((C58970a) C18340am.f52024a.mo56224b()).mo56372aa(47289)).mo56386p("Create output stream for processed audio");
                                    }
                                } catch (IOException e) {
                                    ((C58970a) ((C58970a) ((C58970a) C18340am.f52024a.mo56225c()).mo56382g(e)).mo56372aa(47290)).mo56386p("Failed to create pfdPipe");
                                    amVar.f52026c = null;
                                    amVar.f52025b = null;
                                }
                            }
                        }
                        if (alVar.mo23799p(16000, i, false, C58836b.f156633a) == 6) {
                            z = true;
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
