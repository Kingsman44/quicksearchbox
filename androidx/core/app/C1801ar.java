package androidx.core.app;

import android.app.Person;
import android.content.Context;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.C1932e;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: androidx.core.app.ar */
/* compiled from: PG */
final class C1801ar {
    /* renamed from: a */
    static Person m4955a(C1803at atVar) {
        Person.Builder name = new Person.Builder().setName(atVar.f5630a);
        IconCompat iconCompat = atVar.f5631b;
        Icon icon = null;
        if (iconCompat != null) {
            icon = C1932e.m5233b(iconCompat, (Context) null);
        }
        return name.setIcon(icon).setUri(atVar.f5632c).setKey(atVar.f5633d).setBot(atVar.f5634e).setImportant(atVar.f5635f).build();
    }

    /* renamed from: b */
    static C1803at m4956b(Person person) {
        C1802as asVar = new C1802as();
        asVar.f5624a = person.getName();
        asVar.f5625b = person.getIcon() != null ? C1932e.m5236e(person.getIcon()) : null;
        asVar.f5626c = person.getUri();
        asVar.f5627d = person.getKey();
        asVar.f5628e = person.isBot();
        asVar.f5629f = person.isImportant();
        return new C1803at(asVar);
    }
}
