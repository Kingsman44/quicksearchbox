package com.google.android.libraries.assistant.assistantactions.p633d.p635b;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89129a;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89134f;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89135g;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89142n;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89143o;
import com.google.android.libraries.assistant.assistantactions.p633d.C11267d;
import com.google.android.libraries.assistant.assistantactions.p633d.C11269f;
import com.google.android.libraries.assistant.assistantactions.p633d.C11270g;

/* renamed from: com.google.android.libraries.assistant.assistantactions.d.b.c */
/* compiled from: PG */
public final class C11264c implements C11270g {

    /* renamed from: a */
    private final C89143o f36691a;

    public C11264c(C89143o oVar) {
        this.f36691a = oVar;
        int i = C11263b.f36690a;
    }

    /* renamed from: a */
    public final void mo19675a(C11269f fVar) {
        C89134f fVar2;
        C89135g gVar = (C89135g) C89142n.f241658n.createBuilder();
        int c = fVar.mo19681c();
        int i = c - 1;
        if (c != 0) {
            switch (i) {
                case 0:
                    fVar2 = C89134f.UNKNOWN;
                    break;
                case 1:
                    fVar2 = C89134f.CONVERSATION_PARAMS_RECEIVED;
                    break;
                case 2:
                    fVar2 = C89134f.CLIENT_OP_EXECUTED;
                    break;
                case 3:
                    fVar2 = C89134f.CONTACT_SELECTION_RENDERED;
                    break;
                case 4:
                    fVar2 = C89134f.CONTACT_SELECTED;
                    break;
                case 5:
                    fVar2 = C89134f.MORE_CONTACTS_TAP;
                    break;
                case 6:
                    fVar2 = C89134f.CONTACT_CONFIRMATION_RENDERED;
                    break;
                case 7:
                    fVar2 = C89134f.CONTACT_PICK_UP_RENDERED;
                    break;
                case 8:
                    fVar2 = C89134f.FLUIDACTIONS_CONFIRM;
                    break;
                case 9:
                    fVar2 = C89134f.FLUIDACTIONS_CANCEL;
                    break;
                case 10:
                    fVar2 = C89134f.CONTACT_LABEL_SELECTION_RENDERED;
                    break;
                case 11:
                    fVar2 = C89134f.CONTACT_LABEL_SELECTED;
                    break;
                case 12:
                    fVar2 = C89134f.PROVIDER_SELECTION_RENDERED;
                    break;
                case 13:
                    fVar2 = C89134f.PROVIDER_SELECTED;
                    break;
                case 14:
                    fVar2 = C89134f.CONTACT_ERROR;
                    break;
                case 15:
                    fVar2 = C89134f.CLIENT_OP_GENERATED_BY_FLUIDACTIONS;
                    break;
                case 16:
                    fVar2 = C89134f.ASSISTANT_DISMISSED;
                    break;
                case 17:
                    fVar2 = C89134f.UDC_PERMISSION_REQUEST_SHOWN;
                    break;
                case 18:
                    fVar2 = C89134f.UDC_PERMISSION_REQUEST_REJECTED;
                    break;
                case 19:
                    fVar2 = C89134f.UDC_PERMISSION_REQUEST_ACCEPTED;
                    break;
                case 20:
                    fVar2 = C89134f.REQUEST_USER_UNLOCK_DEVICE;
                    break;
                case 21:
                    fVar2 = C89134f.DEVICE_UNLOCKED;
                    break;
                case 22:
                    fVar2 = C89134f.USER_QUERY_ISSUED;
                    break;
                case 23:
                    fVar2 = C89134f.USER_QUERY_FULFILLED;
                    break;
                default:
                    throw new IllegalArgumentException("unknown enum value: ".concat(C11267d.m26748a(c)));
            }
            gVar.copyOnWrite();
            C89142n nVar = (C89142n) gVar.instance;
            nVar.f241661b = fVar2.f241638y;
            nVar.f241660a |= 1;
            boolean b = fVar.mo19680b();
            gVar.copyOnWrite();
            C89142n nVar2 = (C89142n) gVar.instance;
            nVar2.f241660a |= 128;
            nVar2.f241669j = b;
            if (!TextUtils.isEmpty(fVar.mo19679a())) {
                String a = fVar.mo19679a();
                gVar.copyOnWrite();
                C89142n nVar3 = (C89142n) gVar.instance;
                a.getClass();
                nVar3.f241660a |= 2;
                nVar3.f241663d = a;
            }
            C89143o oVar = this.f36691a;
            C89129a aVar = new C89129a();
            aVar.mo83116c((C89142n) gVar.build());
            oVar.mo27606c(aVar.mo83114a());
            return;
        }
        throw null;
    }
}
