package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82917ff;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82919fh;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82920fi;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122416bh;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.i.l */
/* compiled from: PG */
public final /* synthetic */ class C76752l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C76757q f212108a;

    /* renamed from: b */
    public final /* synthetic */ C83320io f212109b;

    public /* synthetic */ C76752l(C76757q qVar, C83320io ioVar) {
        this.f212108a = qVar;
        this.f212109b = ioVar;
    }

    public final void accept(Object obj) {
        int i;
        String str;
        C76757q qVar = this.f212108a;
        C83320io ioVar = this.f212109b;
        C122416bh bhVar = (C122416bh) obj;
        int i2 = bhVar.f339383a;
        long j = bhVar.f339385c;
        C83334w wVar = qVar.f212119b;
        C82887ec ecVar = C82887ec.PERFORMANCE_TIMING;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        int i3 = bhVar.f339383a;
        int i4 = 0;
        if (i3 == 0) {
            i = 2;
        } else if (i3 == 10000) {
            i = 10002;
        } else if (i3 == 30000) {
            i = 30002;
        } else if (i3 == 22000) {
            i = 22002;
        } else if (i3 != 22001) {
            switch (i3) {
                case 1001:
                    i = 1003;
                    break;
                case 1002:
                    i = 1004;
                    break;
                case 1003:
                    i = 1005;
                    break;
                default:
                    switch (i3) {
                        case 2001:
                            i = 2003;
                            break;
                        case 2002:
                            i = 2004;
                            break;
                        case 2003:
                            i = 2005;
                            break;
                        default:
                            switch (i3) {
                                case 10100:
                                    i = 10102;
                                    break;
                                case 10101:
                                    i = 10103;
                                    break;
                                case 10102:
                                    i = 10104;
                                    break;
                                case 10103:
                                    i = 10105;
                                    break;
                                case 10104:
                                    i = 10106;
                                    break;
                                case 10105:
                                    i = 10107;
                                    break;
                                default:
                                    switch (i3) {
                                        case 10200:
                                            i = 10202;
                                            break;
                                        case 10201:
                                            i = 10203;
                                            break;
                                        case 10202:
                                            i = 10204;
                                            break;
                                        case 10203:
                                            i = 10205;
                                            break;
                                        case 10204:
                                            i = 10206;
                                            break;
                                        case 10205:
                                            i = 10207;
                                            break;
                                        case 10206:
                                            i = 10208;
                                            break;
                                        case 10207:
                                            i = 10209;
                                            break;
                                        default:
                                            switch (i3) {
                                                case 20000:
                                                    i = 20002;
                                                    break;
                                                case 20001:
                                                    i = 20003;
                                                    break;
                                                case 20002:
                                                    i = 20004;
                                                    break;
                                                case 20003:
                                                    i = 20005;
                                                    break;
                                                case 20004:
                                                    i = 20006;
                                                    break;
                                                default:
                                                    switch (i3) {
                                                        case 21000:
                                                            i = 21002;
                                                            break;
                                                        case 21001:
                                                            i = 21003;
                                                            break;
                                                        case 21002:
                                                            i = 21004;
                                                            break;
                                                        case 21003:
                                                            i = 21005;
                                                            break;
                                                        case 21004:
                                                            i = 21006;
                                                            break;
                                                        default:
                                                            i = 0;
                                                            break;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            i = 22003;
        }
        if (i == 0) {
            i = 1;
        }
        if (i != 1) {
            i4 = i - 2;
        }
        int a = C82919fh.m132428a(i4 + 3000000);
        if (a == 0) {
            C58970a aVar = (C58970a) ((C58970a) C76757q.f212118a.mo56225c()).mo56372aa(3647);
            if (i == 1) {
                str = "UNRECOGNIZED";
            } else if (i == 2) {
                str = "UNKNOWN";
            } else if (i == 10002) {
                str = "CONTEXT_UNKNOWN";
            } else if (i == 30002) {
                str = "INSTALLED_APPS_PROVIDER";
            } else if (i == 22002) {
                str = "AA_INIT";
            } else if (i != 22003) {
                switch (i) {
                    case 1003:
                        str = "FULFILL_ANNOTATE";
                        break;
                    case 1004:
                        str = "FULFILL_GETPOP";
                        break;
                    case 1005:
                        str = "FULFILL_CALLPOP";
                        break;
                    default:
                        switch (i) {
                            case 2003:
                                str = "GETINTENT_ANNOTATE";
                                break;
                            case 2004:
                                str = "GETINTENT_GETPOP";
                                break;
                            case 2005:
                                str = "GETINTENT_CALLPOP";
                                break;
                            default:
                                switch (i) {
                                    case 10102:
                                        str = "CONTEXT_PARAM_UNKNOWN";
                                        break;
                                    case 10103:
                                        str = "CONTEXT_PARAM_MEDIA";
                                        break;
                                    case 10104:
                                        str = "CONTEXT_PARAM_ALARM";
                                        break;
                                    case 10105:
                                        str = "CONTEXT_PARAM_TIMER";
                                        break;
                                    case 10106:
                                        str = "CONTEXT_PARAM_STOPWATCH";
                                        break;
                                    case 10107:
                                        str = "CONTEXT_PARAM_CALL_STATE";
                                        break;
                                    default:
                                        switch (i) {
                                            case 10202:
                                                str = "CONTEXT_GENERIC_UNKNOWN";
                                                break;
                                            case 10203:
                                                str = "CONTEXT_CONTACT";
                                                break;
                                            case 10204:
                                                str = "CONTEXT_AUM_CONTACT";
                                                break;
                                            case 10205:
                                                str = "CONTEXT_AUM_RESOLVE_PROVIDER";
                                                break;
                                            case 10206:
                                                str = "CONTEXT_AUM_INSTANCE_LABEL";
                                                break;
                                            case 10207:
                                                str = "CONTEXT_AUM_INSTANCE";
                                                break;
                                            case 10208:
                                                str = "CONTEXT_SHORTCUTS";
                                                break;
                                            case 10209:
                                                str = "CONTEXT_CALL_HISTORY";
                                                break;
                                            default:
                                                switch (i) {
                                                    case 20002:
                                                        str = "POPINIT_GET_POP_RESOURCES";
                                                        break;
                                                    case 20003:
                                                        str = "POPINIT_GET_GALLIUM_RESOURCES";
                                                        break;
                                                    case 20004:
                                                        str = "POPINIT_GET_ACCOUNT";
                                                        break;
                                                    case 20005:
                                                        str = "POPINIT_INIT_SYNC";
                                                        break;
                                                    case 20006:
                                                        str = "POPINIT_INIT_ASYNC";
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 21002:
                                                                str = "TCLIB_INIT";
                                                                break;
                                                            case 21003:
                                                                str = "TCLIB_GET_CORE_GROUP";
                                                                break;
                                                            case 21004:
                                                                str = "TCLIB_GET_PERSON_GROUP";
                                                                break;
                                                            case 21005:
                                                                str = "TCLIB_GET_WEBREF_GROUP";
                                                                break;
                                                            case 21006:
                                                                str = "TCLIB_GET_LIGHTWEIGHT_GROUP";
                                                                break;
                                                            default:
                                                                str = "null";
                                                                break;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            } else {
                str = "AA_GET_TELEPORT_GROUP";
            }
            aVar.mo56389s("Could not convert performance type %s", str);
            a = 3000002;
        }
        C82917ff ffVar = (C82917ff) C82920fi.f226214c.createBuilder();
        ffVar.copyOnWrite();
        C82920fi fiVar = (C82920fi) ffVar.instance;
        fiVar.f226217b = a - 1;
        fiVar.f226216a |= 1;
        C82920fi fiVar2 = (C82920fi) ffVar.build();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        fiVar2.getClass();
        eaVar.f225980b = fiVar2;
        eaVar.f225979a = 3;
        wVar.mo75547e(ecVar, (C82885ea) dzVar.build(), ioVar, Duration.ofNanos(bhVar.f339385c), Duration.ofNanos(bhVar.f339384b), 2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
