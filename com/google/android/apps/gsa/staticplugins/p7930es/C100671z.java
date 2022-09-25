package com.google.android.apps.gsa.staticplugins.p7930es;

import android.bluetooth.BluetoothAdapter;
import com.google.android.apps.gsa.p496a.p499b.C9308b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6727dt.C85458b;
import com.google.android.apps.gsa.search.core.p6519al.p6727dt.C85460d;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.es.z */
/* compiled from: PG */
public final class C100671z extends C86734a implements C85460d {

    /* renamed from: a */
    private final C100653h f281504a;

    /* renamed from: b */
    private final C100664s f281505b;

    /* renamed from: c */
    private final C68214a f281506c;

    public C100671z(C100664s sVar, C100653h hVar, C68214a aVar) {
        super(C118575h.WORKER_XMS, "xms");
        this.f281505b = sVar;
        this.f281504a = hVar;
        this.f281506c = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo78985a(C85458b bVar) {
        BluetoothAdapter defaultAdapter;
        if (!C58890d.m90990e("text/plain", bVar.f231286a) || bVar.f231289d.length != 1) {
            ((C89859i) this.f281506c.mo27525b()).mo83702b(C89849ae.OPA_CHAT_XMSWORKER_MMS_SEND_START);
            C100653h hVar = this.f281504a;
            C90748e.m148224b();
            return hVar.f281454b.mo28210j(hVar.f281454b.mo28209i(hVar.f281454b.mo28201a("create sendReq", new C100649d(hVar, bVar)), "write temp pdu to file", new C100650e(hVar)), "Send MMS Internal", new C100651f(hVar));
        }
        ((C89859i) this.f281506c.mo27525b()).mo83702b(C89849ae.OPA_CHAT_XMSWORKER_SMS_SEND_START);
        C100664s sVar = this.f281505b;
        String str = bVar.f231289d[0];
        String str2 = bVar.f231287b;
        if (sVar.f281487e.mo56113h() && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null && defaultAdapter.isEnabled() && (!sVar.f281488f.mo79746e(C90086ek.f250409cb) || !sVar.f281486d.mo56113h() || !((C9308b) sVar.f281486d.mo56107c()).mo17489d().isEmpty())) {
            ((C89859i) sVar.f281489g.mo27525b()).mo83702b(C89849ae.OPA_CHAT_XMSWORKER_SMS_VIA_MAPCLIENT_START);
            return C60922j.m93045h(C60838bs.m92859i(sVar.mo92000b(str, str2)), new C100658m(sVar, str, str2), C60826bg.f164896a);
        }
        try {
            ArrayList<String> divideMessage = sVar.f281490h.f253815a.divideMessage(str2);
            return C60922j.m93045h(C60838bs.m92859i(C60922j.m93045h(C60838bs.m92859i(sVar.mo92000b(str, str2)), new C100656k(sVar, divideMessage.size(), str, divideMessage), C60826bg.f164896a)), new C100657l(sVar), C60826bg.f164896a);
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C100664s.f281482a.mo56225c()).mo56382g(e)).mo56372aa(33960)).mo56386p("Exception while dividing sms");
            ((C89859i) sVar.f281489g.mo27525b()).mo83702b(C89849ae.OPA_CHAT_XMSWORKER_SMS_DIVIDE_EXCEPTION);
            return C60856cj.m92899h(new Exception("Exception while dividing SMS: ".concat(String.valueOf(e.getMessage()))));
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
