package com.google.android.libraries.assistant.hotword;

import android.os.ParcelFileDescriptor;
import com.google.android.libraries.assistant.soda.C19244ag;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.io.IOException;

/* renamed from: com.google.android.libraries.assistant.hotword.am */
/* compiled from: PG */
final class C18340am {

    /* renamed from: a */
    public static final C58974d f52024a = C58974d.m91134h("SodaProcessedAudioMgr");

    /* renamed from: b */
    ParcelFileDescriptor[] f52025b = null;

    /* renamed from: c */
    ParcelFileDescriptor.AutoCloseOutputStream f52026c;

    /* renamed from: d */
    public final C19244ag f52027d = new C19244ag();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23806a() {
        if (this.f52025b != null) {
            if (this.f52026c != null) {
                try {
                    ((C58970a) ((C58970a) f52024a.mo56224b()).mo56372aa(47286)).mo56386p("Closing outputStream");
                    this.f52026c.close();
                    this.f52026c = null;
                } catch (IOException e) {
                    ((C58970a) ((C58970a) ((C58970a) f52024a.mo56225c()).mo56382g(e)).mo56372aa(47287)).mo56386p("Failed to close outputStream");
                }
            }
            try {
                ((C58970a) ((C58970a) f52024a.mo56224b()).mo56372aa(47282)).mo56386p("Closing pfdPipe write stream");
                this.f52025b[1].close();
            } catch (IOException e2) {
                ((C58970a) ((C58970a) ((C58970a) f52024a.mo56225c()).mo56382g(e2)).mo56372aa(47285)).mo56386p("Failed to close pfdPipe write stream");
            }
            try {
                ((C58970a) ((C58970a) f52024a.mo56224b()).mo56372aa(47283)).mo56386p("Closing pfdPipe read stream");
                this.f52025b[0].close();
            } catch (IOException e3) {
                ((C58970a) ((C58970a) ((C58970a) f52024a.mo56225c()).mo56382g(e3)).mo56372aa(47284)).mo56386p("Failed to close pfdPipe read stream");
            }
            this.f52025b = null;
        }
    }
}
