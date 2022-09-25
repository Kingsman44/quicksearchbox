package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.google.common.p4522b.C58495hd;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.be */
/* compiled from: PG */
public final /* synthetic */ class C103852be implements Function {

    /* renamed from: a */
    public final /* synthetic */ C103868bu f289106a;

    public /* synthetic */ C103852be(C103868bu buVar) {
        this.f289106a = buVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C103868bu buVar = this.f289106a;
        C103877cc ccVar = (C103877cc) obj;
        StringBuilder sb = new StringBuilder();
        sb.append(ccVar.f289168c);
        sb.append(" (");
        C63042fg fgVar = ccVar.f289169d;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        sb.append(C62950b.m95474e(fgVar));
        sb.append(")\n");
        if (!ccVar.f289167b.isEmpty()) {
            sb.append("\tException: ");
            sb.append(ccVar.f289167b);
            sb.append("\n");
        }
        sb.append("\tLocale: ");
        sb.append(ccVar.f289170e);
        sb.append("\n\tAPK version: ");
        sb.append(ccVar.f289171f);
        sb.append("\n\tSoT enabled: ");
        sb.append((ccVar.f289166a & 32) != 0 ? Boolean.valueOf(ccVar.f289172g) : "UNKNOWN");
        sb.append("\n\tFlags:\n");
        for (C103872by byVar : ccVar.f289177l) {
            C58495hd hdVar = buVar.f289138j;
            int i = byVar.f289150b;
            sb.append("\t\t");
            sb.append((String) hdVar.getOrDefault(Integer.valueOf(i), Integer.toString(i)));
            sb.append(" = ");
            sb.append(byVar.f289151c);
            sb.append(" [S = ");
            sb.append(byVar.f289152d);
            sb.append("]\n");
        }
        sb.append("\tPH config groups: ");
        C103876cb cbVar = ccVar.f289173h;
        if (cbVar == null) {
            cbVar = C103876cb.f289161b;
        }
        sb.append(C103868bu.m171815g(cbVar));
        sb.append("\n\tLatest SoT groups: ");
        C103876cb cbVar2 = ccVar.f289174i;
        if (cbVar2 == null) {
            cbVar2 = C103876cb.f289161b;
        }
        sb.append(C103868bu.m171815g(cbVar2));
        sb.append("\n\tDownloaded groups: ");
        C103876cb cbVar3 = ccVar.f289175j;
        if (cbVar3 == null) {
            cbVar3 = C103876cb.f289161b;
        }
        sb.append(C103868bu.m171815g(cbVar3));
        sb.append("\n\tPending groups: ");
        C103876cb cbVar4 = ccVar.f289176k;
        if (cbVar4 == null) {
            cbVar4 = C103876cb.f289161b;
        }
        sb.append(C103868bu.m171815g(cbVar4));
        sb.append("\n");
        return sb.toString();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
