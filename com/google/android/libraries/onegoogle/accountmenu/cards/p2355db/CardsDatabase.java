package com.google.android.libraries.onegoogle.accountmenu.cards.p2355db;

import android.content.Context;
import androidx.p182p.C3919ab;
import androidx.p182p.C3925ah;
import com.google.android.libraries.onegoogle.common.C30909ai;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.db.CardsDatabase */
/* compiled from: PG */
public abstract class CardsDatabase extends C3925ah {

    /* renamed from: k */
    private static volatile CardsDatabase f82213k;

    /* renamed from: A */
    public static CardsDatabase m56643A(Context context, Executor executor) {
        if (f82213k == null) {
            synchronized (CardsDatabase.class) {
                if (f82213k == null) {
                    C3919ab a = C30909ai.m57699a(context, executor, CardsDatabase.class, "og_cards.db");
                    a.mo8159e(1, 2, 3);
                    f82213k = (CardsDatabase) a.mo8155a();
                }
            }
        }
        return f82213k;
    }

    /* renamed from: B */
    public abstract C30433l mo35988B();

    /* renamed from: z */
    public abstract C30427f mo35989z();
}
