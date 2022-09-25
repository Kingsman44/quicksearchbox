package com.google.android.apps.gsa.search.core.google.p6790a;

import android.accounts.Account;
import android.bluetooth.BluetoothAdapter;
import android.net.Uri;
import com.google.android.apps.gsa.p496a.p497a.C9300a;
import com.google.android.apps.gsa.p496a.p497a.C9306b;
import com.google.android.apps.gsa.p496a.p497a.p498a.C9303c;
import com.google.android.apps.gsa.p496a.p497a.p498a.C9305e;
import com.google.android.apps.gsa.p496a.p499b.C9308b;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.libraries.assistant.auto.tng.p894c.p895a.C13202c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.storage.p3304a.p3305a.C42714a;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3917i.p3918a.C51340eb;
import com.google.assistant.p3897e.p3917i.p3918a.C51342ed;
import com.google.assistant.p3897e.p3917i.p3918a.C51343ee;
import com.google.assistant.p3897e.p3917i.p3918a.C51344ef;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62962ci;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.af */
/* compiled from: PG */
public final /* synthetic */ class C85787af implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C85789ah f231942a;

    public /* synthetic */ C85787af(C85789ah ahVar) {
        this.f231942a = ahVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        String str;
        C85789ah ahVar = this.f231942a;
        C51303cs csVar = (C51303cs) obj;
        boolean z = true;
        if (ahVar.f231950g.mo79746e(C90086ek.f250409cb) && ahVar.f231947d.mo56113h()) {
            C51343ee eeVar = (C51343ee) C51344ef.f133730b.createBuilder();
            C58528ij a = ((C9308b) ahVar.f231947d.mo56107c()).mo17486a();
            C58528ij d = ((C9308b) ahVar.f231947d.mo56107c()).mo17489d();
            C58528ij b = ((C9308b) ahVar.f231947d.mo56107c()).mo17487b();
            C58528ij c = ((C9308b) ahVar.f231947d.mo56107c()).mo17488c();
            HashSet<String> hashSet = new HashSet<>();
            hashSet.addAll(a);
            hashSet.addAll(d);
            hashSet.addAll(b);
            hashSet.addAll(c);
            for (String str2 : hashSet) {
                C51340eb ebVar = (C51340eb) C51342ed.f133723f.createBuilder();
                boolean contains = a.contains(str2);
                ebVar.copyOnWrite();
                C51342ed edVar = (C51342ed) ebVar.instance;
                edVar.f133725a |= 1;
                edVar.f133726b = contains;
                boolean contains2 = d.contains(str2);
                ebVar.copyOnWrite();
                C51342ed edVar2 = (C51342ed) ebVar.instance;
                int i = 2;
                edVar2.f133725a |= 2;
                edVar2.f133727c = contains2;
                boolean contains3 = b.contains(str2);
                ebVar.copyOnWrite();
                C51342ed edVar3 = (C51342ed) ebVar.instance;
                edVar3.f133725a |= 4;
                edVar3.f133728d = contains3;
                if (ahVar.f231950g.mo79746e(C90086ek.f250370bp) && ahVar.f231948e.mo56113h()) {
                    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    if (defaultAdapter == null) {
                        C59104x d2 = C85789ah.f231944a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "DeviceProp.ProtoFiller");
                        ((C59052c) ((C59052c) d2).mo56372aa(7948)).mo56386p("#maybeSetPairedPhones, bluetooth not supported");
                    } else {
                        try {
                            if (!((C13202c) ahVar.f231948e.mo56107c()).mo20977a(defaultAdapter.getRemoteDevice(str2))) {
                                i = 1;
                            }
                            C58976aa aaVar = C58975e.f156826a;
                            ebVar.copyOnWrite();
                            C51342ed edVar4 = (C51342ed) ebVar.instance;
                            edVar4.f133729e = i - 1;
                            edVar4.f133725a |= 8;
                        } catch (IllegalArgumentException e) {
                            C59104x c2 = C85789ah.f231944a.mo56225c();
                            c2.mo56378ag(C58975e.f156826a, "DeviceProp.ProtoFiller");
                            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(7947)).mo56386p("Invalid MAC address");
                        }
                    }
                }
                C51342ed edVar5 = (C51342ed) ebVar.build();
                eeVar.copyOnWrite();
                C51344ef efVar = (C51344ef) eeVar.instance;
                edVar5.getClass();
                efVar.mo53588a();
                efVar.f133732a.add(edVar5);
            }
            csVar.copyOnWrite();
            C51334dw dwVar = (C51334dw) csVar.instance;
            C51344ef efVar2 = (C51344ef) eeVar.build();
            C62962ci ciVar = C51334dw.f133657N;
            efVar2.getClass();
            dwVar.f133668I = efVar2;
            dwVar.f133688b |= 16384;
        }
        if (ahVar.f231950g.mo79746e(C90086ek.f250249A) && ahVar.f231947d.mo56113h()) {
            C58528ij b2 = ((C9308b) ahVar.f231947d.mo56107c()).mo17487b();
            int size = b2.size();
            if (size == 1) {
                C58976aa aaVar2 = C58975e.f156826a;
                str = (String) b2.mo55229u().get(0);
            } else {
                if (size > 1) {
                    C59104x d3 = C9300a.f32286a.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "ContactUpNoticeHlpr");
                    ((C59052c) ((C59052c) d3).mo56372aa(12)).mo56386p("#getPairedPhoneAddressForPrimaryPhone, more than one device found");
                }
                if (size == 0) {
                    C59104x b3 = C9300a.f32286a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "ContactUpNoticeHlpr");
                    ((C59052c) ((C59052c) b3).mo56372aa(11)).mo56386p("#getPairedPhoneAddressForPrimaryPhone, no paired phones found");
                }
                str = null;
            }
            if (str != null) {
                C9306b bVar = ahVar.f231949f.f32287b;
                Account a2 = ((C86054o) bVar.f32296a.mo27525b()).mo79668a();
                C42718e a3 = C42719f.m75461a(bVar.f32297b);
                C42719f.m75462b("managed");
                a3.f111967b = "managed";
                C42719f.m75463c("contactsync");
                a3.f111968c = "contactsync";
                a3.mo45821b("ContactSyncData.pb");
                if (a2 != null) {
                    C58976aa aaVar3 = C58975e.f156826a;
                    C42714a.m75444b(a2);
                    a3.f111969d = a2;
                }
                Uri a4 = a3.mo45820a();
                C42880af afVar = bVar.f32298c;
                C42877ac i2 = C42878ad.m75739i();
                i2.mo45968e(a4);
                i2.mo45967d(C9305e.f32293b);
                C9303c cVar = (C9303c) Collections.unmodifiableMap(((C9305e) C60856cj.m92910s(afVar.mo45979a(i2.mo45964a()).mo46042d())).f32295a).get(str);
                if (cVar == null || !cVar.f32290a) {
                    z = false;
                }
                csVar.copyOnWrite();
                C51334dw dwVar2 = (C51334dw) csVar.instance;
                C62962ci ciVar2 = C51334dw.f133657N;
                dwVar2.f133688b |= 268435456;
                dwVar2.f133675Q = z;
            }
        }
        return csVar;
    }
}
