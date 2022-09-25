package com.google.android.apps.gsa.search.shared.contact;

import android.content.res.Resources;
import android.provider.ContactsContract;
import com.google.p4152bb.p4153a.C55094fq;
import com.google.p4152bb.p4153a.C55096fs;
import com.google.p4152bb.p4153a.C55097ft;

/* renamed from: com.google.android.apps.gsa.search.shared.contact.b */
/* compiled from: PG */
public final class C87514b {

    /* renamed from: a */
    private static C87514b f236414a;

    /* renamed from: b */
    private final String f236415b;

    /* renamed from: c */
    private final String f236416c;

    /* renamed from: d */
    private final String f236417d;

    /* renamed from: e */
    private final String f236418e;

    /* renamed from: f */
    private final String f236419f;

    public C87514b(Resources resources) {
        resources = resources == null ? Resources.getSystem() : resources;
        this.f236415b = ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, 1, (CharSequence) null).toString();
        this.f236416c = ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, 12, (CharSequence) null).toString();
        this.f236417d = ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, 2, (CharSequence) null).toString();
        this.f236418e = ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, 7, (CharSequence) null).toString();
        this.f236419f = ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, 3, (CharSequence) null).toString();
        f236414a = this;
    }

    /* renamed from: a */
    public static C87514b m142145a(Resources resources) {
        if (f236414a == null) {
            f236414a = new C87514b(resources);
        }
        return f236414a;
    }

    /* renamed from: b */
    public final C55097ft mo81622b(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C55094fq fqVar = (C55094fq) C55097ft.f144980d.createBuilder();
        fqVar.copyOnWrite();
        C55097ft ftVar = (C55097ft) fqVar.instance;
        ftVar.f144982a |= 2;
        ftVar.f144984c = str;
        if (str.equalsIgnoreCase(this.f236415b)) {
            fqVar.copyOnWrite();
            C55097ft ftVar2 = (C55097ft) fqVar.instance;
            ftVar2.f144983b = 1;
            ftVar2.f144982a |= 1;
        } else if (str.equalsIgnoreCase(this.f236416c)) {
            fqVar.copyOnWrite();
            C55097ft ftVar3 = (C55097ft) fqVar.instance;
            ftVar3.f144983b = 4;
            ftVar3.f144982a |= 1;
        } else if (str.equalsIgnoreCase(this.f236417d)) {
            fqVar.copyOnWrite();
            C55097ft ftVar4 = (C55097ft) fqVar.instance;
            ftVar4.f144983b = 3;
            ftVar4.f144982a |= 1;
        } else if (str.equalsIgnoreCase(this.f236419f)) {
            fqVar.copyOnWrite();
            C55097ft ftVar5 = (C55097ft) fqVar.instance;
            ftVar5.f144983b = 2;
            ftVar5.f144982a |= 1;
        } else {
            fqVar.copyOnWrite();
            C55097ft ftVar6 = (C55097ft) fqVar.instance;
            ftVar6.f144983b = 5;
            ftVar6.f144982a |= 1;
        }
        return (C55097ft) fqVar.build();
    }

    /* renamed from: c */
    public final String mo81623c(C55097ft ftVar) {
        if (ftVar == null) {
            return null;
        }
        int i = ftVar.f144982a;
        if ((i & 1) == 0 && (i & 2) == 0) {
            return null;
        }
        if ((i & 2) != 0) {
            String str = ftVar.f144984c;
            if (str.equalsIgnoreCase(this.f236415b)) {
                return this.f236415b;
            }
            if (str.equalsIgnoreCase(this.f236416c)) {
                return this.f236416c;
            }
            if (str.equalsIgnoreCase(this.f236417d)) {
                return this.f236417d;
            }
            return str.equalsIgnoreCase(this.f236419f) ? this.f236419f : str;
        }
        int a = C55096fs.m87592a(ftVar.f144983b);
        if (a == 0 || a == 1) {
            return this.f236415b;
        }
        if (a == 2) {
            return this.f236419f;
        }
        if (a != 3) {
            return a != 4 ? this.f236418e : this.f236416c;
        }
        return this.f236417d;
    }
}
