package com.google.android.apps.gsa.staticplugins.opa.p8378m;

import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.apz;
import com.google.assistant.p3897e.p3921j.aqa;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.m.a */
/* compiled from: PG */
public final class C109455a {
    /* renamed from: a */
    public static C51805du m182150a(byte[] bArr) {
        apz apz = (apz) aqa.f135600c.createBuilder();
        C63088z A = C63088z.m96139A(bArr);
        apz.copyOnWrite();
        aqa aqa = (aqa) apz.instance;
        aqa.f135602a |= 1;
        aqa.f135603b = A;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.WorkflowActionV2CompleteInput";
        C63088z byteString = ((aqa) apz.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "workflow.ACTIONV2_COMPLETE";
        dsVar.mo53729a("workflow_actionv2_complete_input", (C52230ka) jzVar.build());
        return (C51805du) dsVar.build();
    }
}
