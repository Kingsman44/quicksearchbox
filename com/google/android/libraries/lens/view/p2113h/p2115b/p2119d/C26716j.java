package com.google.android.libraries.lens.view.p2113h.p2115b.p2119d;

import android.text.TextUtils;
import com.google.p4017at.p4056g.p4057a.p4058a.C54018bz;
import com.google.p4017at.p4056g.p4057a.p4058a.C54020ca;
import com.google.p4479cg.C58078j;
import com.google.p4479cg.C58079k;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.lens.view.h.b.d.j */
/* compiled from: PG */
public final class C26716j {

    /* renamed from: a */
    private static final Pattern f72845a = Pattern.compile("^\\+?(-?[0-9]+\\.[0-9]+)\\+?(-?[0-9]+\\.[0-9]+)/?$");

    /* renamed from: a */
    public static C54020ca m49393a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = f72845a.matcher(str);
        if (!matcher.find() || matcher.groupCount() < 2) {
            return null;
        }
        double parseDouble = Double.parseDouble(matcher.group(1));
        double parseDouble2 = Double.parseDouble(matcher.group(2));
        C54018bz bzVar = (C54018bz) C54020ca.f141734f.createBuilder();
        C58078j jVar = (C58078j) C58079k.f155250c.createBuilder();
        jVar.copyOnWrite();
        ((C58079k) jVar.instance).f155252a = parseDouble;
        jVar.copyOnWrite();
        ((C58079k) jVar.instance).f155253b = parseDouble2;
        bzVar.copyOnWrite();
        C58079k kVar = (C58079k) jVar.build();
        kVar.getClass();
        ((C54020ca) bzVar.instance).f141736a = kVar;
        return (C54020ca) bzVar.build();
    }
}
