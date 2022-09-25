package com.google.android.apps.gsa.shared.p7045k;

import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.google.android.apps.gsa.shared.k.ac */
/* compiled from: PG */
public final class C89795ac {

    /* renamed from: a */
    public static final C59071e f243050a = C59071e.m91332i("com.google.android.apps.gsa.shared.k.ac");

    /* renamed from: b */
    public final C68214a f243051b;

    /* renamed from: c */
    public final C68214a f243052c;

    /* renamed from: d */
    private final C22871g f243053d;

    public C89795ac(C68214a aVar, C22871g gVar, C68214a aVar2) {
        this.f243051b = aVar;
        this.f243053d = gVar;
        this.f243052c = aVar2;
    }

    /* renamed from: b */
    private final C60870cx m146179b(boolean z, InetAddress inetAddress, C89793aa aaVar) {
        URL url;
        String hostAddress = inetAddress.getHostAddress();
        if (z) {
            try {
                url = new URL("https", hostAddress, 8443, "/setup/eureka_info?params=device_info.capabilities,opt_in,net,setup,settings,device_info.cloud_device_id,sign,version");
            } catch (MalformedURLException e) {
                ((C59052c) ((C59052c) ((C59052c) f243050a.mo56225c()).mo56382g(e)).mo56372aa(10535)).mo56389s("error constructing URL from ip %s", hostAddress);
                return C60856cj.m92899h(e);
            }
        } else {
            url = new URL("http", hostAddress, C89796ad.m146181a().f243056a ? C89796ad.m146181a().f243057b : 8008, "/setup/eureka_info?params=device_info.capabilities,opt_in,net,setup,settings,device_info.cloud_device_id,sign,version");
        }
        return this.f243053d.mo28209i(this.f243053d.mo28202b("DeviceConnector connect", new C89828x(this, z, url)), "Parse DeviceConnector response", new C89829y());
    }

    /* renamed from: a */
    public final C60870cx mo83643a(C89809e eVar) {
        return m146179b(eVar.mo83656j(), eVar.mo83652g(), new C89793aa());
    }
}
