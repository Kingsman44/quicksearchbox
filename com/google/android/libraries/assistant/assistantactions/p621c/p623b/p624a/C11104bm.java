package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import android.app.KeyguardManager;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11208c;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d;
import com.google.assistant.p3897e.p3917i.p3918a.C51401gi;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52138gq;
import com.google.assistant.p3897e.p3921j.C52141gt;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.bm */
/* compiled from: PG */
public final /* synthetic */ class C11104bm implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C11108bq f36388a;

    /* renamed from: b */
    public final /* synthetic */ C11054a f36389b;

    /* renamed from: c */
    public final /* synthetic */ C52490tr f36390c;

    /* renamed from: d */
    public final /* synthetic */ boolean f36391d;

    public /* synthetic */ C11104bm(C11108bq bqVar, C11054a aVar, C52490tr trVar, boolean z) {
        this.f36388a = bqVar;
        this.f36389b = aVar;
        this.f36390c = trVar;
        this.f36391d = z;
    }

    public final Object apply(Object obj) {
        C11108bq bqVar = this.f36388a;
        C11054a aVar = this.f36389b;
        C52490tr trVar = this.f36390c;
        boolean z = this.f36391d;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (!(bqVar.f36404f == null || bqVar.f36405g == null)) {
            KeyguardManager keyguardManager = (KeyguardManager) bqVar.f36403e.getSystemService("keyguard");
            C58528ij a = bqVar.f36408j.mo19663a((int) ((Long) C58833ax.m90833j((Long) aVar.f36301d.get(21)).mo56109e(0L)).longValue());
            if (aVar.mo19521b(22) && booleanValue && keyguardManager.isDeviceLocked() && bqVar.f36405g.mo19588s().mo56113h() && !a.contains(bqVar.f36405g.mo19588s().mo56107c()) && bqVar.f36405g.mo19575f().mo56113h() && bqVar.f36405g.mo19575f().mo56107c() != C51401gi.SET_MESSAGE && trVar.f137798b != 9) {
                C52138gq gqVar = (C52138gq) C52141gt.f136816c.createBuilder();
                C51953ff ffVar = bqVar.f36401c;
                C52507uh uhVar = bqVar.f36402d;
                C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
                jzVar.copyOnWrite();
                C52230ka kaVar = (C52230ka) jzVar.instance;
                kaVar.f137059a |= 1;
                kaVar.f137060b = "assistant.api.client_input.FormInput";
                C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
                tsVar.copyOnWrite();
                C52492tt ttVar = (C52492tt) tsVar.instance;
                ffVar.getClass();
                ttVar.f137806b = ffVar;
                ttVar.f137805a |= 1;
                tsVar.copyOnWrite();
                C52492tt ttVar2 = (C52492tt) tsVar.instance;
                uhVar.getClass();
                ttVar2.f137807c = uhVar;
                ttVar2.f137805a |= 2;
                C63088z byteString = ((C52492tt) tsVar.build()).toByteString();
                jzVar.copyOnWrite();
                C52230ka kaVar2 = (C52230ka) jzVar.instance;
                byteString.getClass();
                kaVar2.f137059a |= 2;
                kaVar2.f137061c = byteString;
                C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
                dsVar.copyOnWrite();
                C51805du duVar = (C51805du) dsVar.instance;
                duVar.f135926a |= 1;
                duVar.f135927b = "ui.FORM_INPUT";
                dsVar.mo53729a("form_input", (C52230ka) jzVar.build());
                C63088z byteString2 = ((C51805du) dsVar.build()).toByteString();
                gqVar.copyOnWrite();
                C52141gt gtVar = (C52141gt) gqVar.instance;
                byteString2.getClass();
                gtVar.f136818a |= 1;
                gtVar.f136819b = byteString2;
                return C58833ax.m90834k(C11208c.m26566b(C58485gu.m89846n(C11209d.m26575e("device.WAIT_FOR_AUTHENTICATION", "wait_for_authentication_args", "assistant.api.client_op.WaitForAuthenticationArgs", (C52141gt) gqVar.build())), C58733pz.f156496a, bqVar.f36404f.mo19552a()));
            }
        }
        return bqVar.mo19604b(aVar, trVar, z);
    }
}
