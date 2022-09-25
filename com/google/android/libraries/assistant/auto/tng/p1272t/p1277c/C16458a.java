package com.google.android.libraries.assistant.auto.tng.p1272t.p1277c;

import com.google.p343ac.p358e.p359a.p360a.C6664a;
import com.google.p343ac.p358e.p359a.p360a.C6665b;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.assistant.auto.tng.t.c.a */
/* compiled from: PG */
public final class C16458a {

    /* renamed from: a */
    private static final Pattern f48368a = Pattern.compile("(\\d*)\\.(\\d*)\\.(\\d*).(.*)");

    /* renamed from: a */
    public static C6665b m33411a(String str) {
        C6664a aVar = (C6664a) C6665b.f19917f.createBuilder();
        Matcher matcher = f48368a.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            long parseLong = Long.parseLong(group);
            aVar.copyOnWrite();
            C6665b bVar = (C6665b) aVar.instance;
            bVar.f19919a = 1 | bVar.f19919a;
            bVar.f19920b = parseLong;
            String group2 = matcher.group(2);
            group2.getClass();
            long parseLong2 = Long.parseLong(group2);
            aVar.copyOnWrite();
            C6665b bVar2 = (C6665b) aVar.instance;
            bVar2.f19919a = 2 | bVar2.f19919a;
            bVar2.f19921c = parseLong2;
            String group3 = matcher.group(3);
            group3.getClass();
            if (!group3.isEmpty()) {
                long parseLong3 = Long.parseLong(matcher.group(3));
                aVar.copyOnWrite();
                C6665b bVar3 = (C6665b) aVar.instance;
                bVar3.f19919a |= 4;
                bVar3.f19922d = parseLong3;
            }
            String group4 = matcher.group(4);
            group4.getClass();
            if (!group4.isEmpty()) {
                String group5 = matcher.group(4);
                aVar.copyOnWrite();
                C6665b bVar4 = (C6665b) aVar.instance;
                group5.getClass();
                bVar4.f19919a |= 8;
                bVar4.f19923e = group5;
            }
            return (C6665b) aVar.build();
        }
        throw new IllegalArgumentException("Version format is not valid.");
    }
}
